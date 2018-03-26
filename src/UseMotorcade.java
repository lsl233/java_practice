//package ch6;
//
//public class UseMotorcade {
//    public static void main(String[] args) {
//        Motorcade groupCar = null;
//        groupCar = new Motorcade(); 	// （1）创建Motorcade对象
//        groupCar.name = "一个车队";
//        int carCount = 5;
//        groupCar.cars = new Car[5]; 	// （2）给groupCar的cars属性赋值
//        String direction = "镇江";
//        for (int i = 0; i < carCount; i++) {
//            // （3）给groupCar的cars中的每个引用赋值
//            groupCar.cars[i] = new Car();
//            groupCar.cars[i].name = "汽车" + (i + 1);
//            groupCar.cars[i].direction = direction;
//        }							// 赋值结束
//        System.out.println("车队的名称为：" + groupCar.name);
//        // （4）输出groupCar的name属性值
//        System.out.println("车队中汽车的名字分别为：");
//        for (int i = 0; i < carCount; i++) {
//            // （5）cars数组中每个引用指向的Car类对象的name属性值
//            System.out.println(groupCar.cars[i].name);
//        }
//    }
//}