import java.util.Scanner;

public class Recharge {
    public static void main(String[] args) {
        // 浮点数不能直接比较
        double a = 1.0;
        double b = 0.5 + 0.5;
        System.out.println(b);
        System.out.println(Math.abs(a - b) < 1e-6);
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("请投币：");
            int amount = in.nextInt();
            if (amount >= 10) {
                System.out.println("*************");
                System.out.println("***票价10元***");
                System.out.println("*************");

                System.out.println("找零：" + (amount - 10));
            } else {
                System.out.println("钱不够");
            }
        }
    }
}
