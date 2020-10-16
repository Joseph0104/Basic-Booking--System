import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Booking.getName();
        Booking.getPhoneNumber();
        Booking.getServiceList();

        System.out.println("Name : "+ Booking.name + "\nPhone number : " + Booking.phoneNumber + "\nService : " + Booking.serviceList [Booking.number-1].substring(3, Booking.serviceList [Booking.number-1].length()));
    }
}
