package Class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Please enter your gender");
        char l=k.next() .charAt(0);
        System.out.println("your gender is " + l);

        System.out.println("Please enter your name");
        String name=k.nextLine(); // when we have to tsken only one word as input
        System.out.println("your name is " + name);

        System.out.println("Please enter your full name");
        String fullName=k.nextLine();
        System.out.println("your full name is " + fullName);
    }
}
