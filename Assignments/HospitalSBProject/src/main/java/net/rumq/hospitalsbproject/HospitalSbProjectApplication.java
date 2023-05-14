package net.rumq.hospitalsbproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalSbProjectApplication {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(HospitalSbProjectApplication.class, args);

        System.out.println("01 Getting the bean by type");
        var hospital1 = ctx.getBean(Hospital.class);
        System.out.println(hospital1);

        System.out.println("02A Getting the bean by name");
        var hospital2 = ctx.getBean("StelinasComponent");
        System.out.println(hospital2);

        System.out.println("02B Getting the bean by name and type");
        var hospital3 = ctx.getBean(Hospital.class, "StelinasComponent");
        System.out.println(hospital3);

        System.out.println("03 Showing the bean is a singleton");
        var hospitalsingleton1 = ctx.getBean("StelinasComponent", Hospital.class);
        System.out.println(hospitalsingleton1);
        var hospitalsingleton2 = ctx.getBean("StelinasComponent", Hospital.class);
        System.out.println(hospitalsingleton2);
        System.out.println("hospitalsingleton1==hospitalsingleton2= " + (hospitalsingleton1==hospitalsingleton2));


        System.out.println("04 Show that the bean is lazy");
        var lazyComponent = ctx.getBean("lazyComponent", LazyComponent.class);
        System.out.println(lazyComponent);

        System.out.println("05 Show the prototype component");
        var prototypeComponent = ctx.getBean(PrototypeComponent.class);
        System.out.println(prototypeComponent);
        var prototypeComponent2 = ctx.getBean(PrototypeComponent.class);
        System.out.println(prototypeComponent2);

        System.out.println("Prototype1==Prototype2 " + (prototypeComponent==prototypeComponent2));


        System.out.println("08 Qualifier, Collection, Map Injection");
        var qualifierAutowiredDI = ctx.getBean("qualifierAutowiredDI", QualifierAutowiredDI.class);
        System.out.println("08: " + qualifierAutowiredDI);
        System.out.println("08A : " + ctx.getBean("doctor", Doctor.class));
        System.out.println("08B : " + ctx.getBean("nurse", Nurse.class));
        System.out.println("08C : " + ctx.getBean("receptionist", Receptionist.class));


        // Injecting a value from application.properties
        var injectingValues = ctx.getBean("injectingValues", InjectingValues.class);
        System.out.println(injectingValues);
    }



}
