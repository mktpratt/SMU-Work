/**
 * DescribeProgramHere
 *
 * @author Mike Pratt -- A00320459
 * @version 1.0
 */

import java.util.Scanner;

public class Vehicle  
{

    public String vehicleMake, vehicleOwner;
    public double numDoors; 
      

    //A make -- which is the name of the manufacturer (such as "Ford", "GM", "Toyota", ...).
    //A number of doors -- which is just what it says. Only positive numbers are allowed. (Note that vehicles that advertise themselves to have "two and a half doors" actually have three doors!)
    //An owner -- who is a Person (the class has been provided for you). 
               
        public Vehicle(String initialMake, double initialDoors, String initialOwner)
        {
            if (initialDoors > 0)
            {
            vehicleOwner = initialOwner;
            numDoors = initialDoors;
            vehicleMake = initialMake;
            }
        }
        
        public String getMake() 
        {
            return vehicleMake;
        }
        
        public double getNumDoors() 
        {
            return numDoors;
        }
        
        public String getOwner() 
        {
            return vehicleOwner;
        }
        
        public void setOwner(String newOwner) 
        {
            vehicleOwner = newOwner;
        }
        
        public String toString() 
        {
            return vehicleOwner + "'s " + numDoors + "-door " + vehicleMake;
        }
        
            
}

