package Homework;

import java.util.Scanner;

public class heightsInches {
    public static void main(String[] args) {
        Scanner height=new Scanner (System.in);
        System.out.println("enter person heights in inches");
        int inch=height.nextInt();
        if(inch<60){
            System.out.println("Short");
        } else if (inch>60 && inch<72) {
            System.out.println("Medium");
        } else if (inch>72) {
            System.out.println("Tall");
            
        }

    }
}
