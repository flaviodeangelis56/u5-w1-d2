package flaviodeangelis.u5w1d1.entities;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Menù {
    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;
}
