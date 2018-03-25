import java.util.Scanner;

/**
 * 英制计量单位转换
 * （英尺 + 英寸 / 12） * 0.3048 = 米
 * 整数int相除，接口也会是整数（会省略小数）（转换为浮点数double）
 * 所有的整数都可以由浮点数表达
 * 浮点数double计算有误差
 * 整数运算速度笔记浮点数快
 */
public class Calc {
    public static void main(String[] args) {
        System.out.println("整数相除10 / 3 = " + 10 / 3);
        System.out.println("浮点数计算1.2 - 1.1 = " + (1.2 - 1.1));
        int foot;
        int inch;
        Scanner in = new Scanner(System.in);
        foot = in.nextInt();
        inch = in.nextInt();
        System.out.println("foot:" + foot + "inch:" + inch);
        System.out.println((foot + inch / 12.0) * 0.3048);
    }
}
