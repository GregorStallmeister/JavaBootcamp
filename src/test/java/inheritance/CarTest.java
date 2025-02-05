package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void equalsExpectedTrueWhenCompare2CarsIdenticallyInitialized() {
        // given
        Car car1 = new Car("Opel", "Meriva A", 2009, 5);
        Car car2 = new Car("Opel", "Meriva A", 2009, 5);
        boolean expected = true;

        // when
        boolean actual = car1.equals(car2);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void equalsExpectedFalseWhenCompare2CarsIdenticallyButNumberOfDoorsInitialized() {
        // given
        Car car1 = new Car("Opel", "Meriva A", 2009, 5);
        Car car2 = new Car("Opel", "Meriva A", 2009, 3);
        boolean expected = false;

        // when
        boolean actual = car1.equals(car2);

        // then
        assertEquals(expected, actual);
    }
}
