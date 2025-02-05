package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    @Test
    public void equalsExpectedTrueWhenCompare2VehiclesIdenticallyInstantiated() {
        // given
        Vehicle veh1 = new Vehicle("Opel", "Meriva A", 2009);
        Vehicle veh2 = new Vehicle("Opel", "Meriva A", 2009);
        boolean expected = true;

        // when
        boolean actual = veh1.equals(veh2);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void equalsExpectedFalsWhenCompare2VehiclesIdenticallyButYearInstantiated() {
        // given
        Vehicle veh1 = new Vehicle("Opel", "Meriva A", 2009);
        Vehicle veh2 = new Vehicle("Opel", "Meriva A", 2007);
        boolean expected = false;

        // when
        boolean actual = veh1.equals(veh2);

        // then
        assertEquals(expected, actual);
    }
}
