import java.util.Scanner;

/**
 * 温度转换
 */
public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入华氏温度: ");
        int f = in.nextInt();
        System.out.println(f);
        int c = (f - 32) * 5 / 9;
        System.out.println("摄氏温度: " + c );
    }
}
