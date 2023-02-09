package hello.proxy.pureproxy.decorator;

import hello.proxy.pureproxy.decorator.abstractcode.*;
import org.junit.jupiter.api.Test;

public class AbstractTest {

    @Test
    void decorator_abstract_test () {
        Component realComponent = new RealComponent();
        MessageDecorator messageDecorator = new MessageDecorator(realComponent);
        TimeDecorator timeDecorator = new TimeDecorator(messageDecorator);
        DecoratorPatternClient client = new DecoratorPatternClient(timeDecorator);
        client.execute();
    }
}
