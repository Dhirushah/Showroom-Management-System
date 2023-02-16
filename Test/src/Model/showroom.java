package Model;

import java.util.ArrayList;

public class showroom {
    String location;
    int totalworker;
    ArrayList<Bike>Bike;
    ArrayList<car>car;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalworker() {
        return totalworker;
    }

    public void setTotalworker(int totalworker) {
        this.totalworker = totalworker;
    }

    public ArrayList<showroom.Bike> getBike() {
        return Bike;
    }

    public void setBike(ArrayList<showroom.Bike> bike) {
        Bike = bike;
    }

    public ArrayList<showroom.car> getCar() {
        return car;
    }

    public void setCar(ArrayList<showroom.car> car) {
        this.car = car;
    }

    public showroom(String location, int totalworker, ArrayList<showroom.Bike> bike, ArrayList<showroom.car> car) {
        this.location = location;
        this.totalworker = totalworker;
        Bike = bike;
        this.car = car;
    }

    public static class Bike  {
        String Bike_model;
        String Bike_name;
        int cc;

        public String getBike_model() {
            return Bike_model;
        }

        public void setBike_model(String bike_model) {
            Bike_model = bike_model;
        }

        public String getBike_name() {
            return Bike_name;
        }

        public void setBike_name(String bike_name) {
            Bike_name = bike_name;
        }

        public int getCc() {
            return cc;
        }

        public void setCc(int cc) {
            this.cc = cc;
        }

        public Bike(String bike_model, String bike_name, int cc) {
            super();
            Bike_model = bike_model;
            Bike_name = bike_name;
            this.cc = cc;
        }
    }

    public static class car {
            String name;

            int wheel;
            String color;
            boolean seatbelt;

        public car(String name, int wheel, String color, boolean seatbelt) {

            this.name = name;

            this.wheel = wheel;
            this.color = color;
            this.seatbelt = seatbelt;
        }
    }
}
