package Homework;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner age=new Scanner(System.in);
        System.out.println("Please enter your age");
        int a1=age.nextInt();
        if(a1>=18){
            System.out.println("You are eligible to vote");

        }else {
            System.out.println("You are not eligible to vote");
        }


    }
}
