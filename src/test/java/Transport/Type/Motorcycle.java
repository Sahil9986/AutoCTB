package Transport.Type;

import Transport.Vehicle;

import java.lang.classfile.Superclass;

public class Motorcycle extends Vehicle {
    @Override
    public void Startengine() {
        System.out.println("Motorcycle Engine Started");
    }
    public void Diskbrake(){
        System.out.println("Motorcycle has dual disk brake");
    }
    public void Headlight(){
        System.out.println("Motorcycle has dual headlight");
    }
    public void Mileage(){
        System.out.println("Motorcycle has 25kmpl mileage");
    }
}
