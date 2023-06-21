package demos.spdemo07example.profiles;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "apiserver")
public class MyBeanWithValues {

}
