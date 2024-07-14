public class ConstructorHomework1 {
    public static void main(String[] args) {
       Rectangle obj = new Rectangle(10.5,20.75,"White");
       obj.displayinfo();

    }
}

class Dog{
    private String name;
    private int age;


    //Default constructor

    Dog(){
        this.name="Unknown";
        this.age=0;
    }

    public void displayinfo(){
        System.out.println("The name of the Dog is "+name);
        System.out.println("The age of the Dog is "+ age);
    }}

class Car   {
    private String model;
    private int year;

    Car(String model,int year){
        this.model=model;
        this.year=year;
    }
    public  void displayinfo(){
        System.out.println("The name of the model is "+ model);
        System.out.println("the name of th year is "+ year);
    }

}


class Rectangle{
    private double length;
    private double width;
    private String color;
    Rectangle (double length,double width,String color){
        this.length=length;
        this.width=width;
        this.color=color;
    }
    public void displayinfo(){
        System.out.println("The length of the rectangle is "+ length);
        System.out.println("The width of the rectangle is "+width);
        System.out.println("The color of the rectangle is "+ color);
    }
}