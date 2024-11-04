package collection.set;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetExample {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Set<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);

        System.out.println("Weekend days: " + weekend);

        // Добавление элемента
        weekend.add(Day.FRIDAY);
        System.out.println("После добавления пятницы: " + weekend);

        // Итерация по множеству
        for (Day day : weekend) {
            System.out.println(day);
        }
    }
}
