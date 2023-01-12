package Class7;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        boolean condition=true;
        Scanner m=new Scanner(System.in);
        int number=15;
        while (condition){
            System.out.println("Please enter the number between 10 to 20");
            int l=m.nextInt();
            if(l>number){
                System.out.println("you entered number is greater");
            } else if (l<number) {
                System.out.println("you entered smaller number");
            }else {
                System.out.println("You won!");
                condition=false;
            }
        }
    }
}
