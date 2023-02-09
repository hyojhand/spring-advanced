# spring-advanced

## [Advanced](https://www.notion.so/advanced)

HTTP 요청을 Thread 별로 구분하고, 깊이를 표현하는 **로그 추적기(Log Trace) 구현**
- **ThreadLocal**을 활용해 필드로 사용하는 traceId 동시성 문제 해결
- **템플릿 메서드 패턴**으로 핵심 기능과 부가 기능(로그 추적기)을 분리해서 모듈화
- **전략 패턴**으로 의존관계를 주입하여 상속으로 인한 문제 개선
- **템플릿 콜백 패턴**으로 실행 시점에 원하는 전략의 유연한 변경이 가능하게 개선

<img src="https://user-images.githubusercontent.com/87989933/216826916-208e703f-92a3-40f6-b3e3-68c59b14308b.png" width="80%">
