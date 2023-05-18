package demo.spdemo06configurationclasses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DemoApplication.class);

        Doctor dr = ctx.getBean("getPaid", Doctor.class);
        System.out.println("dr " + dr);



        Emergency emergency = ctx.getBean(Emergency.class);
        System.out.println("emergency: " + emergency);


        Doctor dr2 = ctx.getBean("getBonus", Doctor.class);
        System.out.println("dr2 " + dr2);
    }

}
