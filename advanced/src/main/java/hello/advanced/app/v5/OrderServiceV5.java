package hello.advanced.app.v5;

import hello.advanced.app.v4.OrderRepositoryV4;
import hello.advanced.trace.callback.TraceTemplate;
import hello.advanced.trace.logtrace.LogTrace;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceV5 {

    private final OrderRepositoryV4 orderRepository;
    private final TraceTemplate template;

    public OrderServiceV5(OrderRepositoryV4 orderRepository, LogTrace logTrace) {
        this.orderRepository = orderRepository;
        this.template = new TraceTemplate(logTrace);
    }

    public void orderItem(String itemId) {
        template.execute("OrderService.orderItem()", () -> {
            orderRepository.save(itemId);
            return null;
        });
    }

}