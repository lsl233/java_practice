import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        int hour;
        int minute;
        String BJTTime = "123";
        if (time >= 0 && time <= 2359) {
            if (time >= 0 && time < 10) {
                BJTTime = "0点" + time + "分";
            }
//        else if (time >= 10 && time < 100) {
//            BJTTime
//        }
            System.out.println(BJTTime);
        }
    }
}
