package Homework;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        System.out.println("Please enter the length");
        double l2=l.nextDouble();
        System.out.println("Please enter the width");
        double l3=l.nextDouble();
        if(l2==l3){
            System.out.println("The shape of your object is square");
        }else {
            System.out.println("The shape of your object is rectangle");
        }

        }
    }

