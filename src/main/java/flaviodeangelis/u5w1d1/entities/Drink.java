package flaviodeangelis.u5w1d1.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Drink {
    private String drinkName;
    private int calories;
    private double price;
}
