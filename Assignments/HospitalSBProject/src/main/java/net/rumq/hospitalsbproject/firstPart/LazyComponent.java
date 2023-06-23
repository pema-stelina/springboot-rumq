package net.rumq.hospitalsbproject.firstPart;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

@Component
@Lazy
public class LazyComponent {

    public LazyComponent() {
        System.out.println("LazyComponent Creation");
    }

    @Override
    public String toString() {
        return "Hello from LazyComponent";
    }
}
