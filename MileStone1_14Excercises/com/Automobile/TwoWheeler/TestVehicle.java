package com.Automobile.TwoWheeler;

/**
 * Created by pujithapabbaraju on 16/05/18.
 */
/*
Create a package called com.automobile. Define an abstract class called Vehicle. Vehicle class has the following abstract methods:
public String getModelName()
public String getRegistrationNumber()
public String getOwnerName()
Create TwoWheeler subpackage under Automobile package Hero class extends Automobile.vehicle class
public int getSpeed()
– Returns the current speed of the vehicle.
public void radio()
– provides facility to control the radio device
Honda class extends com.automobile.vehicle class
public int getSpeed()
– Returns the current speed of the vehicle.
public void cdplayer()
– provides facility to control the cd player device which is available in the car. Create a test class to test the methods available in all these child class.
 */
public class TestVehicle {
    public static void main(String args[]){
        Hero h = new Hero("Hero","123","pujitha");
        System.out.println("Testing Hero");
        System.out.println("Hero speed"+h.getSpeed());
        System.out.println("Hero radio");
        h.radio();
        System.out.println("ModelName:" + h.getModelName());
        System.out.println("Registration Number: "+ h.getRegistrationNumber());
        System.out.println("Owner Name : "+ h.getRegistrationNumber());
        Honda h2 = new Honda("Honda","345","Mounika");
        System.out.println("Testing Honda");
        System.out.println("Honda speed"+h2.getSpeed());
        System.out.println("Honda cdPlayer");
        h2.cdPlayer();
        System.out.println("ModelName:" + h2.getModelName());
        System.out.println("Registration Number: "+ h2.getRegistrationNumber());
        System.out.println("Owner Name : "+ h2.getRegistrationNumber());

    }
}
