package chapter_static;

import java.util.Objects;

public class Counters {
    protected static int totalCount = 0;

    protected int instanceCount = 0;

    public Counters() {}

    public Counters(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public static void setTotalCount(int totalCount) {
        Counters.totalCount = totalCount;
    }

    public static int incrementTotalCount() {
        totalCount++;

//        if (totalCount == 4) // for verifying test incrementTotalCountExpectedIncreasedBy1EveryTimeWhenCalled
//            return 42;

        return  totalCount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Counters counters = (Counters) o;
        return instanceCount == counters.instanceCount;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(instanceCount);
    }

    @Override
    public String toString() {
        return "Counters{" +
                "instanceCount=" + instanceCount +
                ", totalCount=" + totalCount +
                '}';
    }

    public int incrementInstanceCount() {
        instanceCount++;

//        if (instanceCount == 100) // for verifying test incrementInstanceCountExpectedIncreasedBy1EveryTimeWhenCalled
//            return 84;

        return instanceCount;
    }
}
