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
public class Hero extends com.Automobile.Vehicle {
    int speed;
    public int getSpeed(){
        return 10;
    }
    public void radio(){
        System.out.println("You can control the radio");
    }
    Hero(String modelName, String registrationNumber, String ownerName){
        this.setModelName(modelName);
        this.setOwnerName(ownerName);
        this.setRegistrationNumber(registrationNumber);
    }

}
