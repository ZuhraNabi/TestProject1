package Homework;

import java.util.Scanner;
import java.util.SortedMap;

public class DMV {
    public static void main(String[] args) {
        Scanner k=new Scanner (System.in);
        System.out.println("How old are you?");
        int age=k.nextInt();
        if(age>=18){
            System.out.println("issue a driver license ");
        }else {
            System.out.println("get a learners permit");
        }

    }
}
