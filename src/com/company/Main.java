package com.company;

import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 输入输出
//        Scanner in = new Scanner(System.in);
//        System.out.print("what is your name:");
//        String name = in.nextLine();
//        String firstName = in.next();
//        int age = in.nextInt();
//        double db = in.nextDouble();
//        System.out.println(name + ' ' + firstName);

        String input = JOptionPane.showInputDialog("what's your name");

        // 退出程序
        System.exit(0);
    }
}
