package Homework;

import java.util.Scanner;

public class loan {
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        System.out.println("what is the amount of loan is needed?");
        int loan=l.nextInt();
        if(loan<=2000000){
            System.out.println("lend the money ");

        }else {
            System.out.println("reject the client. ");
        }
    }
}
