package com.lived;

import com.lived.domain.member.entity.Member;
import com.lived.domain.member.enums.*;
import com.lived.domain.member.repository.MemberRepository;
import com.lived.domain.routine.entity.RoutineFruit;
import com.lived.domain.routine.entity.mapping.MemberRoutine;
import com.lived.domain.routine.enums.FruitType;
import com.lived.domain.routine.enums.RepeatType;
import com.lived.domain.routine.repository.MemberRoutineRepository;
import com.lived.domain.routine.repository.RoutineFruitRepository;
import com.lived.domain.routine.service.RoutineService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("local")
@Transactional
class FlushOrderTest {

    @Autowired RoutineService routineService;
    @Autowired MemberRepository memberRepository;
    @Autowired MemberRoutineRepository memberRoutineRepository;
    @Autowired RoutineFruitRepository routineFruitRepository;

    @Test
    void toggle_without_manual_flush_reflects_in_achievement_rate() {
        // given
        Member member = memberRepository.save(
                Member.builder()
                        .provider(Provider.values()[0])
                        .socialId("test-social-" + System.nanoTime())
                        .name("테스트")
                        .nickname("테스트유저")
                        .email("test@test.com")
                        .gender(Gender.values()[0])
                        .birth(LocalDate.of(2000, 1, 1))
                        .livingPeriod(LivingPeriod.values()[0])
                        .status(MemberStatus.ACTIVE)
                        .build()
        );

        MemberRoutine routine = memberRoutineRepository.save(
                MemberRoutine.builder()
                        .member(member)
                        .title("테스트 루틴")
                        .repeatType(RepeatType.WEEKLY)
                        .repeatValue("0,1,2,3,4,5,6")
                        .startDate(LocalDate.now().minusDays(7))
                        .isActive(true)
                        .build()
        );

        LocalDate today = LocalDate.now();
        LocalDate thisMonth = today.withDayOfMonth(1);

        // when 1: 첫 번째 토글 (기록 생성, isDone = true)
        boolean first = routineService.toggleRoutineCheck(routine.getId(), today);

        // then 1: 완료 1건이 달성률에 반영됨
        RoutineFruit fruitAfterFirst = routineFruitRepository
                .findByMemberRoutineIdAndMonth(routine.getId(), thisMonth)
                .orElseThrow();
        assertThat(first).isTrue();
        assertThat(fruitAfterFirst.getAchievementRate()).isGreaterThan(0.0);

        System.out.println("===== 두 번째 toggle 시작 =====");

        // when 2: 두 번째 토글 (isDone true → false, 더티 체킹 UPDATE)
        boolean second = routineService.toggleRoutineCheck(routine.getId(), today);

        System.out.println("===== 두 번째 toggle 끝 =====");

        // then 2: 수동 flush 없이도 count가 UPDATE를 반영해 달성률 0
        RoutineFruit fruitAfterSecond = routineFruitRepository
                .findByMemberRoutineIdAndMonth(routine.getId(), thisMonth)
                .orElseThrow();
        assertThat(second).isFalse();
        assertThat(fruitAfterSecond.getAchievementRate()).isEqualTo(0.0);
        assertThat(fruitAfterSecond.getFruitType()).isEqualTo(FruitType.NONE);
    }
}