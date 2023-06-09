package demos.spdemo07example.yamlpropertiesfiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean3a {

    @Value("${contact.tel}")
    private String tel;

    @Value("${contact.email}")
    private String email;

    @Value("${contact.web}")
    private String web;

    @Override
    public String toString() {
        return String.format("Hello from MyBean3a tel %s, email %s, web %s", tel, email, web);
    }
}
