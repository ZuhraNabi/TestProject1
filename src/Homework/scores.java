package Homework;

import java.util.Scanner;

public class scores {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        System.out.println("quiz, midterm, and final scores");
        int f=d.nextInt();
        int k=d.nextInt();
        int m=d.nextInt();
       int quiz= (f+k+m)/3;
       if(quiz>=90){
           System.out.println("Grade A");
           if(quiz>=70 && quiz<90){
               System.out.println("Grade B");
           } else if (quiz>=50 && quiz<70) {
               System.out.println("Grade C");
               
           }else if(quiz<50){
               System.out.println("Grade F");
           }
       }
    }
}
