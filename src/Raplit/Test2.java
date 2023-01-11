package Raplit;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
       Scanner m=new Scanner(System.in);
        System.out.println("Please enter first number");
        int x=m.nextInt();
        System.out.println("Please enter second number");
        int y=m.nextInt();
        if(x*y>0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
