package Class4;

public class NestedIfDemo7 {
    public static void main(String[] args) {
        boolean studyHard = true;
        int salary = 90000;
        if (studyHard) {
            System.out.println("we get the jobs");
            if (salary > 100000) {
                System.out.println("lets buy Tesla");
            } else {
                System.out.println("lets buy Toyota");
            }
        } else {
            System.out.println("It might take a little bit longer for us to get the job ");
        }
    }

}



