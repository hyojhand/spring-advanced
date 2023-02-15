package hello.proxy.common.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteService {
    public String call() {
        log.info("ConcreteService 호출");
        return "ConcreteService 호출";
    }
}
