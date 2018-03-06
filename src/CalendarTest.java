import java.util.*;

public class CalendarTest {
    public static void main(String[] args) {
        GregorianCalendar d = new GregorianCalendar();

        int tody = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);

        d.set(Calendar.DAY_OF_MONTH,1);
        System.out.println(tody);
        System.out.println(month);
    }
}
