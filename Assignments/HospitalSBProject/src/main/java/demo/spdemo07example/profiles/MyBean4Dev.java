package demo.spdemo07example.profiles;

import org.springframework.stereotype.Component;

@Component
public class MyBean4Dev implements MyBean4 {

    @Override
    public String toString() {
        return "Hello from MyBean4Dev";
    }
}
