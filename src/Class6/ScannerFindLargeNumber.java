package Class6;

import java.util.Scanner;

public class ScannerFindLargeNumber {
    public static void main(String[] args) {
        int a,b,c;
        Scanner number=new Scanner(System.in);
        System.out.println("PLease enter 3 number");
        a=number.nextInt();
        b=number.nextInt();
        c=number.nextInt();

        if(a>b && a>c){
            System.out.println("The largest number is " + a);
        }
         else if(b>a && b>c){
            System.out.println("The largest number is " + b);
        }
         else if(c>a && c>b){
            System.out.println("The largest number is " + c);
        }
    }
}
