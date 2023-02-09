package hello.proxy.pureproxy.decorator.abstractcode;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Decorator implements Component {

    private final Component component;

    @Override
    public String operation() {
        return component.operation();
    }

}
