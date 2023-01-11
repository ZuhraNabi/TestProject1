package Homework;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        System.out.println("Please input the City");
        String city=c.nextLine();
        System.out.println("Please enter the temperature");
        double temp=c.nextDouble();
        double  celsius =(( 5 *(temp - 32.0)) / 9.0);
        System.out.println("The temperature in the "+"" + city +" "+" is"+" "+celsius);
    }
}
