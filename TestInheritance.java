class Vehicle{

    void honk(){

        System.out.println("Pom Pom");
    }

    String colorVehicle;

    int lengthVehicle;



}

// Create a class sportsCar dependent on Vehicle
// Inheritance -- > extends keyword

// format child or derived or subclass nameOfClass extends Base class or Parent class or Super class

class SportsCar extends Vehicle{

    void nitro(){

        System.out.println("Nitro Boosters have been activated");
    }


}


class SuperCar extends SportsCar{

    void flying(){
        System.out.println("Car has started flying");
    }

}



public class TestInheritance {


    public static void main(String[] args) {

        // Parent
        Vehicle obj = new Vehicle();

        System.out.println("These are the characteristics of Vehicle: Grand parent ");

        obj.honk();

        obj.colorVehicle = "red";
        obj.lengthVehicle = 8;
        System.out.println("The color of vehicle is "+obj.colorVehicle);
        System.out.println("The length of the vehicle is "+obj.lengthVehicle);

        // Son

        System.out.println("These are the characteristics of Sports Car: Son ");

        SportsCar obj2 = new SportsCar();
        obj2.colorVehicle="Green";
        obj2.lengthVehicle=6;
        obj2.honk();
        System.out.println("The color of your sports car is "+obj2.colorVehicle);
        System.out.println("The length of your sports car is "+obj2.lengthVehicle);
        obj2.nitro();

        // Grand Son

        System.out.println("These are the characteristics of Super Car: Grand Son ");

        SuperCar obj3 = new SuperCar();

        obj3.nitro();
        obj3.honk();

        obj3.colorVehicle = "blue";
        obj3.lengthVehicle = 7;

        System.out.println("The color of the Super Car is " + obj3.colorVehicle);
        System.out.println("The length of the Super Car is " + obj3.lengthVehicle);

        obj3.flying();




    }




}
