package hello.proxy.cglib;

import hello.proxy.cglib.code.TimeMethodInterceptor;
import hello.proxy.common.service.ConcreteService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.Enhancer;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class CglibTest {
    @Test
    void cglib_test() {
        ConcreteService target = new ConcreteService(); // 구체 클래스

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ConcreteService.class); // 동적 프록시를 만들 구체 클래스
        enhancer.setCallback(new TimeMethodInterceptor(target)); // 호출할 메서드
        ConcreteService proxy = (ConcreteService) enhancer.create();// 프록시 생성
        log.info("targetClass={}", target.getClass());
        log.info("proxyClass={}",proxy.getClass());

        assertThat(proxy.call()).isEqualTo("ConcreteService 호출");
    }
}
