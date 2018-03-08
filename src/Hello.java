import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner in = new Scanner(System.in);
        int price = 0;
        System.out.println(price);
        price = in.nextInt();
        System.out.println("100-" + price + "=" + (100 - price));
    }
}
