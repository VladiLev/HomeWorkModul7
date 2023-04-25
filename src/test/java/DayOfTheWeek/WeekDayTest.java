package DayOfTheWeek;

import Modul8.GetDay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WeekDayTest {



    @Test
    void testPositive() {
        GetDay weekDay = new GetDay();
        Assertions.assertEquals("Sunday", weekDay.getDay(1));
        Assertions.assertEquals("Monday", weekDay.getDay(2));
        Assertions.assertEquals("Tuesday", weekDay.getDay(3));
        Assertions.assertEquals("Wednesday", weekDay.getDay(4));
        Assertions.assertEquals("Thursday", weekDay.getDay(5));
        Assertions.assertEquals("Friday", weekDay.getDay(6));
        Assertions.assertEquals("Saturday", weekDay.getDay(7));
    }

    @Test
    void testNegative() {
        GetDay weekDay = new GetDay();
        Assertions.assertEquals("The number should be equal or larger than 1", weekDay.getDay(0));
        Assertions.assertEquals("The number should be equal or smaller than 7", weekDay.getDay(8));
    }

    @Test
    void testNull() {
        GetDay weekDay = new GetDay();
        Assertions.assertThrows(NullPointerException.class, () -> GetDay.getDay(null));
    }
}

