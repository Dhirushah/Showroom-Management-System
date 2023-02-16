package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Showmain {
    public static void main(String[] args) {
        showroom.car c1= new showroom.car("Creta",5,"white",true);
        showroom.car c2=new showroom.car("brazzar",4,"black",true);

        //bike
        showroom.Bike b1=new showroom.Bike("honda","shine",125);
        showroom.Bike b2=new showroom.Bike("honda","ctr",150);

        //bike arraylist
        ArrayList<showroom.Bike> BikeList1 = new ArrayList<showroom.Bike>();
        BikeList1.add(b1);
        BikeList1.add(b2);
        ArrayList<showroom.Bike> BikeList2 = new ArrayList<showroom.Bike>();
        BikeList2.add(b1);
        BikeList2.add(b2);
        ArrayList<showroom.Bike> BikeList3 = new ArrayList<showroom.Bike>();
        BikeList3.add(b1);
        BikeList3.add(b2);
        ArrayList<showroom.Bike> BikeList4 = new ArrayList<showroom.Bike>();
        BikeList4.add(b1);
        BikeList4.add(b2);

        //car arraylist
        ArrayList<showroom.car>carlist1=new ArrayList<showroom.car>();
        carlist1.add(c1);
        carlist1.add(c2);
        ArrayList<showroom.car>carlist2=new ArrayList<showroom.car>();
        carlist2.add(c1);
        carlist2.add(c2);
        ArrayList<showroom.car>carlist3=new ArrayList<showroom.car>();
        carlist3.add(c1);
        carlist3.add(c2);
        ArrayList<showroom.car>carlist4=new ArrayList<showroom.car>();
        carlist4.add(c1);
        carlist4.add(c2);

        //showroom
        showroom s1= new showroom("ktm",4,BikeList1,carlist1);
        showroom s2= new showroom("Bhaktapur",4,BikeList2,carlist2);
        showroom s3= new showroom("lalitpur",4,BikeList3,carlist3);
        showroom s4= new showroom("pokhara",4,BikeList4,carlist4);

        ArrayList<showroom>showroomlist=new ArrayList<showroom>();
        showroomlist.add(s1);
        showroomlist.add(s2);
        showroomlist.add(s3);
        showroomlist.add(s4);

        //Display Section

        System.out.println("The Location of Showroom :");
        System.out.println(s1.location);
        System.out.println(s2.location);
        System.out.println(s3.location);
        System.out.println(s4.location);
        System.out.println("\n");
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the location of showroom");
            String name=sc.next();
            System.out.println("\n");
            System.out.println("********Car's Details **********");
            if (name.equals("ktm")) {


                for (int i = 0; i < carlist1.size(); i++) {
                    System.out.print("Car's name:\t\"" + carlist1.get(i).name + "\n");
                    System.out.print("Car's Color:\t\"" + carlist1.get(i).color + "\n");
                    System.out.print("Total no Wheel:\t\"" + carlist1.get(i).wheel + "\n");
                    System.out.print("Seatbelt:\t\"" + carlist1.get(i).seatbelt + "\n");
                    System.out.println("\n");
                }
                System.out.println("********Bike's Details **********");
                for (int i = 0; i < BikeList1.size(); i++) {
                    System.out.print("Bike Name\t\"" + BikeList1.get(i).Bike_name + "\n");
                    System.out.print("Bike Model\t" + BikeList1.get(i).Bike_model + "\n");
                    System.out.print("Bike CC\t" + BikeList1.get(i).cc + "\n");
                    System.out.println("\n");
                }
            }
        if (name.equals("Bhaktapur")) {


            for (int i = 0; i < carlist2.size(); i++) {
                System.out.print("Car's name:\t\"" + carlist1.get(i).name + "\n");
                System.out.print("Car's Color:\t\"" + carlist1.get(i).color + "\n");
                System.out.print("Total no Wheel:\t\"" + carlist1.get(i).wheel + "\n");
                System.out.print("Seatbelt:\t\"" + carlist1.get(i).seatbelt + "\n");
                System.out.println("\n");
            }
            System.out.println("********Bike's Details **********");
            for (int i = 0; i < BikeList2.size(); i++) {
                System.out.print("Bike Name\t\"" + BikeList1.get(i).Bike_name + "\n");
                System.out.print("Bike Model\t" + BikeList1.get(i).Bike_model + "\n");
                System.out.print("Bike CC\t" + BikeList1.get(i).cc + "\n");
                System.out.println("\n");
            }
        }
        if (name.equals("lalitpur")) {


            for (int i = 0; i < carlist3.size(); i++) {
                System.out.print("Car's name:\t\"" + carlist1.get(i).name + "\n");
                System.out.print("Car's Color:\t\"" + carlist1.get(i).color + "\n");
                System.out.print("Total no Wheel:\t\"" + carlist1.get(i).wheel + "\n");
                System.out.print("Seatbelt:\t\"" + carlist1.get(i).seatbelt + "\n");
                System.out.println("\n");
            }
            System.out.println("********Bike's Details **********");
            for (int i = 0; i < BikeList3.size(); i++) {
                System.out.print("Bike Name\t\"" + BikeList1.get(i).Bike_name + "\n");
                System.out.print("Bike Model\t" + BikeList1.get(i).Bike_model + "\n");
                System.out.print("Bike CC\t" + BikeList1.get(i).cc + "\n");
                System.out.println("\n");
            }
        }
        if (name.equals("pokhara")) {


            for (int i = 0; i < carlist4.size(); i++) {
                System.out.print("Car's name:\t\"" + carlist1.get(i).name + "\n");
                System.out.print("Car's Color:\t\"" + carlist1.get(i).color + "\n");
                System.out.print("Total no Wheel:\t\"" + carlist1.get(i).wheel + "\n");
                System.out.print("Seatbelt:\t\"" + carlist1.get(i).seatbelt + "\n");
                System.out.println("\n");
            }
            System.out.println("********Bike's Details **********");
            for (int i = 0; i < BikeList4.size(); i++) {
                System.out.print("Bike Name\t\"" + BikeList1.get(i).Bike_name + "\n");
                System.out.print("Bike Model\t" + BikeList1.get(i).Bike_model + "\n");
                System.out.print("Bike CC\t" + BikeList1.get(i).cc + "\n");
                System.out.println("\n");
            }
        }


    }
}
