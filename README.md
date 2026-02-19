<div align="center">
  
<img src="https://github.com/user-attachments/assets/2478bd93-e198-4e98-8303-b65f53b16bc1" width="400"/>

</div>

---

## 🌳 프로젝트 개요
- **프로젝트명:** 살아보니 (Saraboni)
- **프로젝트 기간:** 2025.12.19 ~ 2026.02.19
- **프로젝트 형태:** UMC 9th 프로젝트 (Spring Boot Backend)
- **핵심 가치:** 자취생의 루틴 기록 및 커뮤니티를 통한 일상의 시각화

---

## ⚙ 기술 스택

### 🖥 Back-end
<div>
  <img alt="Java" src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white">
  <img alt="Spring Boot" src="https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
  <img alt="Spring Data JPA" src="https://img.shields.io/badge/Spring%20Data%20JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white">
  <img alt="Spring Security" src="https://img.shields.io/badge/Spring%20Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white">
  <img alt="MySQL" src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
</div>

### ☁ Service Infra & CI/CD
<div>
  <img alt="Docker" src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white">
  <img alt="Amazon EC2" src="https://img.shields.io/badge/Amazon%20EC2-FF9900?style=for-the-badge&logo=Amazon%20EC2&logoColor=white">
  <img alt="Amazon RDS" src="https://img.shields.io/badge/Amazon%20RDS-527FFF?style=for-the-badge&logo=amazonrds&logoColor=white">
  <img alt="Amazon S3" src="https://img.shields.io/badge/Amazon%20S3-FF9900?style=for-the-badge&logo=amazons3&logoColor=white">
  <img alt="Nginx" src="https://img.shields.io/badge/nginx-%23009639.svg?style=for-the-badge&logo=nginx&logoColor=white">
  <img alt="Github Actions" src="https://img.shields.io/badge/github%20actions-%232671E5.svg?style=for-the-badge&logo=githubactions&logoColor=white">
</div>

## 💭 Collaboration Tools
<div>
  <img src="https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white">
  <img src="https://img.shields.io/badge/GITHUB-181717?style=for-the-badge&logo=github&logoColor=white">
  <img src="https://img.shields.io/badge/NOTION-000000?style=for-the-badge&logo=notion&logoColor=white">
  <img src="https://img.shields.io/badge/FIGMA-F24E1E?style=for-the-badge&logo=figma&logoColor=white">
  <img src="https://img.shields.io/badge/DISCORD-5865F2?style=for-the-badge&logo=discord&logoColor=white">
</div>

---

## 🏗 시스템 아키텍처 및 CI/CD
> **Docker와 GitHub Actions를 활용한 무중단 배포 환경 구축**

- **Docker 컨테이너화:** 개발과 운영 환경의 일치성을 보장하기 위해 전체 애플리케이션을 Docker 컨테이너로 관리합니다.
- **CI/CD 자동화:** GitHub Actions를 통해 코드 Push 시 빌드, Docker 이미지 생성, EC2 서버 자동 배포를 수행합니다.
- **Infrastructure:** AWS EC2 내 Nginx를 활용하여 리버스 프록시 환경을 구축했습니다.

---

## 🚀 Key Features

### 1. 루틴 관리 및 시각화 (Routine & Growth)
- **사용자 맞춤형 루틴:** 자취 연차와 고민 키워드에 기반한 초기 루틴 추천 및 커스텀 루틴 생성 시스템.
- **루틴 나무 성장 로직:** 당일 루틴 달성률을 계산하여 4단계 성장 프로세스(씨앗 -> 새싹 -> 꽃 -> 열매)를 거치는 데이터 시각화 구현.
- **월간 루틴 트래커:** JPA 연관 관계를 활용하여 일별/월별 달성률 통계를 산출하고 캘린더 색상 변화로 직관적인 히스토리 제공.

### 2. AI 루틴 추천 서비스 (AI Intelligence)
- **Google Gemini API 연동:** 사용자의 현재 고민(청결, 식사, 심리 등) 데이터를 분석하여 AI가 최적화된 루틴 리스트를 실시간으로 생성 및 제안.
- **Prompt Engineering:** 자취생의 라이프스타일에 특화된 답변을 얻기 위한 정교한 프롬프트 설계.

### 3. 자취생 커뮤니티 (Community)
- **소통의 장:** 자취 꿀팁 및 일상 공유를 위한 게시판 시스템(CRUD).
- **소셜 인터랙션:** 댓글/대댓글 기능 및 게시글 카테고리 필터링 제공.
- **사용자 보호 시스템:** 건전한 커뮤니티 유지를 위한 게시글 신고 및 악성 유저 차단(Block) 기능.

---

## 📊 Database Design
> **ERDCloud를 활용한 데이터 모델링**

[Saraboni 전체 ERD 상세보기](https://www.erdcloud.com/d/fKzAAwTXfPjtWRN5c)

- **정규화된 설계:** 데이터 중복을 최소화하고 무결성을 보장하기 위한 DB 설계 진행.
- **객체 지향 모델링:** JPA 엔티티와 테이블 간의 효율적인 매핑을 통해 복잡한 비즈니스 로직(나무 성장, 통계 등) 지원.

---

## 💭 Collaboration Tools
<div>
  <img src="https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white">
  <img src="https://img.shields.io/badge/GITHUB-181717?style=for-the-badge&logo=github&logoColor=white">
  <img src="https://img.shields.io/badge/NOTION-000000?style=for-the-badge&logo=notion&logoColor=white">
  <img src="https://img.shields.io/badge/FIGMA-F24E1E?style=for-the-badge&logo=figma&logoColor=white">
  <img src="https://img.shields.io/badge/DISCORD-5865F2?style=for-the-badge&logo=discord&logoColor=white">
</div>

---

## 💁‍♂️ UMC-9th Spring - 살아보니's BE 팀원

<table width="100%">
  <tr>
    <td align="center" width="25%"><img src="https://github.com/KimSungJun-01.png" width="120px;" alt=""/></td>
    <td align="center" width="25%"><img src="https://github.com/Hyun-ohohoh.png" width="120px;" alt=""/></td>
    <td align="center" width="25%"><img src="https://github.com/parksooyong03.png" width="120px;" alt=""/></td>
    <td align="center" width="25%"><img src="https://github.com/weejee12.png" width="120px;" alt=""/></td>
  </tr>
  <tr>
    <td align="center" width="25%"><a href="https://github.com/KimSungJun-01"><b>김성준</b></a></td>
    <td align="center" width="25%"><a href="https://github.com/Hyun-ohohoh"><b>나현오</b></a></td>
    <td align="center" width="25%"><a href="https://github.com/parksooyong03"><b>박수용</b></a></td>
    <td align="center" width="25%"><a href="https://github.com/weejee12"><b>위지수</b></a></td>
  </tr>
</table>
