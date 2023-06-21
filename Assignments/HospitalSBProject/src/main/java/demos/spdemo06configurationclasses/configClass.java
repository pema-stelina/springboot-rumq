package demos.spdemo06configurationclasses;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class configClass {

    @Bean
    @Primary
    public Doctor getPaid(){
        return new Doctor(10000);
    }
}
