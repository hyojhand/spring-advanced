# spring-advanced

## [Advanced](./advanced)

HTTP 요청을 Thread 별로 구분하고, 깊이를 표현하는 **로그 추적기(Log Trace) 구현**
- **ThreadLocal**을 활용해 필드로 사용하는 traceId 동시성 문제 해결
- **템플릿 메서드 패턴**으로 핵심 기능과 부가 기능(로그 추적기)을 분리해서 모듈화
- **전략 패턴**으로 의존관계를 주입하여 상속으로 인한 문제 개선
- **템플릿 콜백 패턴**으로 실행 시점에 원하는 전략의 유연한 변경이 가능하게 개선

<img src="https://user-images.githubusercontent.com/87989933/216826916-208e703f-92a3-40f6-b3e3-68c59b14308b.png" width="80%">

## [Proxy](./proxy)
- **프록시**를 사용해 기존 코드를 수정하지 않고, 프록시 구현체를 통해 변경에 유연하게 개선한다.
- **데코레이터 패턴**으로 프록시 체이닝을 통해 부가기능을 추가할 수 있도록 한다.

**동적 프록시** 기술을 사용하여 적용 대상 만큼 프록시 객체를 생성하지 않아도 된다.

- 인터페이스 기반 프록시 : JDK 동적 프록시의 InvocationHandler
- 구현 클래스 기반 프록시 : CGLIB의 MethodInterceptor

**프록시 팩토리(Proxy Factory)** 기능으로 CGLIB, JDK 동적 프록시 기술에 의존하지 않고, 동적 프록시를 생성

- **Advice** 로 프록시의 부가 기능 로직을 특정 기술에 종속적이지 않게 사용할 수 있다.
- **Pointcut** 으로 부가 기능 로직을 어디에 적용할지 필터링한다.
- 하나의 Advice와 하나의 Pointcut을 가지는 **Advisor** 로 역할과 책임을 명확하게 분리한다.

**빈 후처리기(BeanPostProcessor)** 를 사용해 프록시를 생성하는 설정파일의 중복되는 코드를 제거한다.