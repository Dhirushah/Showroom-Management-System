package Model;

import javax.naming.Name;
import java.lang.reflect.Type;
import java.util.Scanner;

public class User extends Price{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the name:");
        String name=sc.next();
        System.out.println("enter the Phone number");
        String phoneNumber=sc.next();
        System.out.println("enter the Address");
        String address=sc.next();
        System.out.println("enter the Date Of Appointment (yyyy-mm-dd");
        String dateOfAppointment=sc.next();

        Scanner input = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Bike");
        System.out.println("2. Car");
        int choice = input.nextInt();

// service

        Scanner service = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Full Service");
        System.out.println("2. Cleaning Service");
        System.out.println("3. modified");

        int Service = service.nextInt();


//display
        System.out.println("**************************************************************************************");
        System.out.println("\t");
        System.out.println("Name:\t" +name);
        System.out.println("Phone Number:\t" +phoneNumber);
        System.out.println("Address:\t" +address);
        System.out.println("Date of Appointment:\t" +dateOfAppointment);
        System.out.println("Type of Vehicles :\t" +choice);
        if(choice==1){
            System.out.println("\t\t\t\t\tBike");

        }else if (choice==2){
            System.out.println("\t\t\t\t\tcar");
        }else {
            System.out.println("invalid");

        };
        System.out.println("Type of Service :\t" +Service);
        switch (Service) {
            case 1:
                System.out.println("\t\t\t\t\tFull Service ");
                break;
            case 2:
                System.out.println("\t\t\t\t\t Cleaning Service ");
                break;
            case 3:
                System.out.println("\t\t\t\t\t modified");
                break;
            default:
                System.out.println("\t\t\t\t\tInvalid option");
        }
        System.out.println("**************************************************************************************");
        System.out.println("price of vehicles:");
    }




}
