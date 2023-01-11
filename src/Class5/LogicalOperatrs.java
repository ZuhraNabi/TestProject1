package Class5;

public class LogicalOperatrs {
    public static void main(String[] args) {
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||false);

        boolean wifi=true;// change it to false
        boolean fiveG=true; // change it to false

        if(wifi||fiveG){
            System.out.println("You are good for browsing the internet.");
        }else{
            System.out.println("Either connect to wifi or to 5G.");
        }
    }
}
