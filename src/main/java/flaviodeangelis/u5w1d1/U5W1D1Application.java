package flaviodeangelis.u5w1d1;

import flaviodeangelis.u5w1d1.entities.Menù;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
@Slf4j
public class U5W1D1Application {

    public static void main(String[] args) {
        SpringApplication.run(U5W1D1Application.class, args);

        configurationMenù();
    }

    public static void configurationMenù() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfiguration.class);
        Menù menù = (Menù) ctx.getBean("getMenù");
        System.out.println("PIZZE");
        menù.getPizzas().forEach(System.out::println);
        System.out.println("INGREDIENTI");
        menù.getToppings().forEach(System.out::println);
        System.out.println("BEVANDE");
        menù.getDrinks().forEach(System.out::println);
        ctx.close();
    }
}
