package flaviodeangelis.u5w1d1;

import flaviodeangelis.u5w1d1.entities.Drink;
import flaviodeangelis.u5w1d1.entities.Menù;
import flaviodeangelis.u5w1d1.entities.Pizza;
import flaviodeangelis.u5w1d1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfiguration {

    @Bean
    Pizza getMargherita() {
        List<Topping> ingredients = new ArrayList<>();
        Topping mozzarella = new Topping("mozzarella", 230, 0.50);
        Topping pomodoro = new Topping("pomodoro", 150, 0.50);
        ingredients.add(mozzarella);
        ingredients.add(pomodoro);
        return new Pizza("margherita", ingredients, 1104, 5.50);
    }

    @Bean
    Pizza getDiavola() {
        List<Topping> ingredients = new ArrayList<>();
        Topping mozzarella = new Topping("mozzarella", 230, 0.50);
        Topping pomodoro = new Topping("pomodoro", 150, 0.50);
        Topping salamePiccante = new Topping("salame piccante", 369, 1.50);
        ingredients.add(mozzarella);
        ingredients.add(pomodoro);
        ingredients.add(salamePiccante);
        return new Pizza("diavola", ingredients, 1264, 7.00);
    }

    @Bean
    Topping getPomodoro() {
        return new Topping("pomodoro", 150, 0.50);
    }

    @Bean
    Topping getMozzarella() {
        return new Topping("mozzarella", 230, 0.50);
    }

    @Bean
    Topping getSalamePiccante() {
        return new Topping("salame piccante", 369, 1.50);
    }

    @Bean
    Drink getAcqua() {
        return new Drink("Acqua", 37, 1.50);
    }

    @Bean
    Drink getCola() {
        return new Drink("Coca Cola", 211, 2.50);
    }

    @Bean
    Menù getMenù(List<Pizza> pizze, List<Topping> ingredienti, List<Drink> bevande) {
        return new Menù(pizze, ingredienti, bevande);
    }
}
