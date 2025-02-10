package record;

import java.util.List;

public record Zoo(
        List<Animal> animals
) {
    public int calculateFoodAmount() {
        int foodAmount = 0;

        for (Animal animal : animals)
            foodAmount += animal.sepcies().foodGramsPerDay();

        return foodAmount;
    }
}
