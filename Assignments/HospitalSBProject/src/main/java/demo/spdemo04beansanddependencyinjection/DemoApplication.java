package demo.spdemo04beansanddependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        var ctx = SpringApplication.run(DemoApplication.class, args);
        var service = ctx.getBean(StaffService.class);
        System.out.println(service.checkup());
    }
}
