package Homework;


public class Diploma {
    public static void main(String[] args) {
     boolean diploma=true;
     double gpa=3.4;
     if (diploma) {
         System.out.println("congratulations");
         if (gpa >= 3.5) {
             System.out.println("You are eligible for scholarship");
         } else {
             System.out.println("You should have studied harder");
         }
     }else{
         System.out.println("Please get a degree");
     }

}
}


