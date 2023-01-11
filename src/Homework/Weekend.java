package Homework;

import java.util.Scanner;

public class Weekend {
    public static void main(String[] args) {
        Scanner weekend=new Scanner(System.in);
        System.out.println("Write a number from 1 to 7");
        int day=weekend.nextInt();
        if(day<=5){
            System.out.println("It is a weekday");
        } else if (day==6 || day==7) {
            System.out.println("Weekend");
            
        }else {
            System.out.println("Invalid day");
        }
    }
}
