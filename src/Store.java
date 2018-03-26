public class Store {
    public static void main(String[] args) {
        Book s = new Book();
        s.name = "西瓜";
        s.count = 12;
        s.price = 15.4;

        Book book2 = new Book();
        System.out.println(s.name);
        System.out.println(s.count);
        System.out.println(s.price);
        System.out.println(book2.name);
    }
}
