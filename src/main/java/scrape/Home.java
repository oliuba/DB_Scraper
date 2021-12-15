package scrape;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor @Getter @ToString
public class Home {
    private int price;
    private double beds;
    private double bathrooms;
    private double garages;
}
