package Class6;

import java.util.Locale;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        String country="China";
        System.out.println(country.toLowerCase());
        switch (country){
            case "usa":
                System.out.println("Burgers");
                break;
            case "itlay":
                System.out.println("Pasta");
                break;
            case "afghanistan":
                System.out.println("Kabab");
                break;
            default:
                System.out.println("Wrong Country");
        }
    }
}
