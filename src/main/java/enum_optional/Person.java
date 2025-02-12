package enum_optional;

import javax.xml.namespace.QName;

public record Person(
        int ID,
        String name,
        DaysOfWeek favoriteDay
) {
    @Override
    public String name() {
        return name;
    }

    @Override
    public DaysOfWeek favoriteDay() {
        return favoriteDay;
    }

    @Override
    public int ID() {
        return ID;
    }
}
