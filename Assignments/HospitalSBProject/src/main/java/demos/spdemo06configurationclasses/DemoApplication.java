package demos.spdemo06configurationclasses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

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

        Doctor specializedDoctor = ctx.getBean("pediatrician", Doctor.class);
        System.out.println("specialized Doctor: " + specializedDoctor);


        Doctor specializedDoctor2 = ctx.getBean("nefrologist", Doctor.class);
        System.out.println("specialized doctor 2: " + specializedDoctor2);

        HeadOfHospital headOfHospital = ctx.getBean("surgeon", HeadOfHospital.class);
        System.out.println("The head of hospital is a : " + headOfHospital);

    }



    @Bean
    Doctor familyDoctor(){
        return new Doctor(1000);
    }

    @Bean(name = {"pediatrician", "nefrologist", "gastrologist"})
    Doctor specializedDoctor() {
        return new Doctor(10000);
    }

    @Bean
    HeadOfHospital surgeon(){
        return new HeadOfHospital(specializedDoctor());
    }

    @Bean
    HeadOfHospital surgeon2(Doctor doctor){
        return new HeadOfHospital(doctor);
    }

}
