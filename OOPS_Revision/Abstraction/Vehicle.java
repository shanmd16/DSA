package OOPS_Revision.Abstraction;

public class Vehicle {

    protected String company;
    protected String name;
    protected String model;
    protected String vehicleType;

    public Vehicle() {
        System.out.println("Vehicle class is called");
    }
    protected void accelerate(){
        System.out.println("Accelerating the method");
    }

}
