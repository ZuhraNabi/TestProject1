package Homework;

public class mortgage {
    public static void main(String[] args) {
        double mortgagerate = 300000;
        double mortgageprice = 6.5;
        if (mortgagerate > 4.5) {
            System.out.println("will not buy a house");
            if (mortgageprice > 200000) {
                System.out.println("take a loan");
            } else {
                System.out.println("will pay cash");
            }
        }else {
            System.out.println("will consider buying");
        }
    }
}
