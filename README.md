# java-racingcar-precourse

## 기능 구현 목록

### 기능 요구사항

- [X] 자동차 이름은 쉼표 기준으로 구분한다.
- [X] 자동차 이름은 5자 이하여야 한다.
- [ ] 0에서 9 사이에서 무작위 값을 구한다.
- [X] 값이 4 이상일 때 자동차는 전진한다.
- [X] 값이 3 이하이면 자동차는 정지한다.
- [X] 자동차 경주 게임을 완료한 후 우승자를 발표한다.
    - 자동차 중 전진 최댓값을 찾는다.
    - 전진 최댓값만큼 전진한 자동차들을 찾는다.
    - 우승자가 여러 명이면 쉼표를 이용하여 구분한다.
- [X] 자동차가 한 대이면 경주 진행이 불가하므로 예외 처리한다.

### 입력

- [X] 경주할 자동차 이름

- [X] 시도할 횟수
    - 아라비아 숫자가 아니면 예외 처리

- [X] 사용자의 잘못된 입력 시 IllegalArgumentException을 발생시키고 앱을 종료한다.

### 출력

- [X] 경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
- [X] 시도할 횟수는 몇 회인가요?
- [ ] 차수별 실행 결과
    - '실행 결과' 출력
    - 차수별 전진 결과 출력
- [ ] 우승자 안내 문구
    - 단독 우승자 = 최종 우승자 : pobi
    - 공동 우승자 = 최종 우승자 : pobi, jun