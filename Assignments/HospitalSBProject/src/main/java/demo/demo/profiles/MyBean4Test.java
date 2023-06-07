package demo.demo.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class MyBean4Test implements MyBean4{
    @Override
    public String toString() {
        return "Hello from MyBean4Test";
    }
}
