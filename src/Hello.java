import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner in = new Scanner(System.in);
        int price = 0;
        int amount = 100;
        System.out.println(price);
        price = in.nextInt();
        System.out.println(amount + "-" + price + "=" + (amount - price));
    }
}
