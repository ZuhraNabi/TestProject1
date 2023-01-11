package Raplit;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.println("Is it sunny outside?");
        boolean h = w.nextBoolean();
        if (h == true) {
            System.out.println("It is a sunny day, I should go somewhere!");
            System.out.println("What is the temperature outside?");
            int h2 = w.nextInt();
            if (h2 > 85) {
                System.out.println("I am going to the beach");
            }else if(h2<85){
                System.out.println("I am going to the park");
            }
        } else if (h==false) {
            System.out.println("I stay home and practice Java!");
            
        }
    }
}

