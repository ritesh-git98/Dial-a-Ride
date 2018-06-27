package com.hackercode.utilities;

public class Car {
    private int cap,location,revenue;
    private int [] passengerLocation;
    public Car(){
        passengerLocation=new int[5];
    }

    public Car[] getCar() {
        return car;
    }

    public void setCar(Car[] car) {
        this.car = car;
    }

    private Car[] car;

    public int getCarTime() {
        return carTime;
    }

    public void setCarTime(int carTime) {
        this.carTime = carTime;
    }

    private  int carTime;

    public int getLocation() {
        return location;
    }
    public void setCap(int cap) {
        this.cap = cap;
    }
    public void setLocation(int location) {
        this.location = location;
    }
    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }
    public void setPassengerLocation(int[] passengerLocation) {
        this.passengerLocation = passengerLocation;
    }
    public int getRevenue() {
        return revenue;
    }
    public int[] getPassengerLocation() {
        return passengerLocation;
    }
    public int getCap() {
        return cap;
    }

    public void setPassengerLocationReset() {
        for (int i=0;i<5;i++){
            passengerLocation[i]=0;
        }
    }
}
