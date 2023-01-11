package Raplit;

import java.util.Scanner;

public class Loan1 {
    public static void main(String [] args){
        Scanner loan = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        Boolean loan2 = loan.nextBoolean();
        if(loan2==true){
            System.out.println("What is your credit score?");
            int loan3=loan.nextInt();
            if(loan3<600){
                System.out.println("The eligibility is Not eligible");
            } else if (loan3<=600 && loan3<=700) {
                System.out.println("The eligibility is Maybe eligible");
            } else if (loan3>700 && loan3<=800) {
                System.out.println("The eligibility is Eligible");

            } else if (loan3>700 && loan3>=800) {
                System.out.println("The eligibility is Definitely eligible");
            }
        }else {
            System.out.println("The eligibility is Unknown");
        }
    }
}

