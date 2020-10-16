import java.util.Scanner;


public class Booking {

    static Scanner scanner = new Scanner( System.in );

    static String name;
    static int phoneNumber;

    static String [] serviceList = {"1) Main Service", "2) Evening Service", "3) Bible Study" };
    static int number;


    public static void getName() {
        System.out.println("Input name :");
        name = scanner.nextLine();
    }


    public static void getPhoneNumber() {
        System.out.println( "Input Phone-number :");
        phoneNumber = Integer.parseInt(scanner.nextLine());

    }


    public static void getServiceList() {
        System.out.println(" Select Service-number:");
        for (String s : serviceList) {
            System.out.println(s);
        }
        number = scanner.nextInt();

    }

}
