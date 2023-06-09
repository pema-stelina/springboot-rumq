package demos.spdemo07example.differentpropertiesfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

//@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        System.setProperty("spring.config.name", "app2");
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        MyBean2 myBean2 = ctx.getBean(MyBean2.class);
        System.out.println(myBean2);
    }
}
