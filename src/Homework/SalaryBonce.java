package Homework;

import java.util.Scanner;

public class SalaryBonce {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter numbers of worked years");
        int year1 = s.nextInt();
        System.out.println("Enter annual salary");
        int salary2 = s.nextInt();
        if (year1 >= 5) {
            System.out.println("eligible for the bonus");
            if (salary2 > 5000) {
                System.out.println("5000");

            } else {
                System.out.println("3000");
            }

        } else {
            System.out.println("he is not");
        }
    }
}



