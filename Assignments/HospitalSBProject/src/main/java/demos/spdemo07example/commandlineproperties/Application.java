package demos.spdemo07example.commandlineproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

//@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        MyBean1 myBean1 = ctx.getBean(MyBean1.class);
        System.out.println(myBean1);
    }
}
