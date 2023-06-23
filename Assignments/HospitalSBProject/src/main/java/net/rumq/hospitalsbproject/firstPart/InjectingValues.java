package net.rumq.hospitalsbproject.firstPart;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InjectingValues {

    @Value("#{systemProperties['user.name']}")
    private String systemProperty;

    @Value("#{systemEnvironment['user.country']}")
    private String getSystemProperty;


    @Override
    public String toString() {
        return "InjectingValues{" +
                "systemProperty='" + systemProperty + '\'' +
                ", getSystemProperty='" + getSystemProperty + '\'' +
                '}';
    }
}
