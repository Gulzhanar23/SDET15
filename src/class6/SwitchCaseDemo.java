package class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {


        String country="Kazakhstan";

        System.out.println(country.toLowerCase());

        switch (country.toLowerCase()){

            case "usa":
                System.out.println("Burgers");
                break;
            case "Italy":
                System.out.println("Pasta");
                break;
            case "Afghanistan":
                System.out.println("Kebab");
                break;
            case "Kazakhstan":
                System.out.println("Beshbarmak");
                break;
            default:
                System.out.println("Wrong country");
        }



    }
}
