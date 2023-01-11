package Homework;

import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner myscan=new Scanner(System.in);
        System.out.println("Please enter month number");
        int month1=myscan.nextInt();
        if(month1==1){
            System.out.println("January");
        }else if(month1==2){
            System.out.println("February");
        }else if(month1==3){
            System.out.println("March");
        }else if(month1==4){
            System.out.println("April");
        }else if(month1==5){
            System.out.println("May");
        }else if(month1==6){
            System.out.println("June");
        }else if(month1==7){
            System.out.println("July");
        }else if(month1==8){
            System.out.println("August");
        }else if(month1==9){
            System.out.println("September");
        }else if(month1==10){
            System.out.println("October");
        }else if(month1==11){
            System.out.println("November");
        }else if(month1==12){
            System.out.println("December");
        }else{
            System.out.println("Invalid");
        }
    }
}

