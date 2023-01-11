package Raplit;

import java.util.Scanner;

public class phoneNumber {
    public static void main(String[] args) {
        Scanner nam=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=nam.nextLine();
        System.out.println("Enter your mobile number");
        String name1=nam.nextLine();
        System.out.println("Enter your age");
        int age=nam.nextInt();
        System.out.println("Your name is " + "" + name +""+" , and your age is "+age+""+" and your mobile number is "+name1+"");
    }
}
