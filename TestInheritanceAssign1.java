

class Person {
    //Data members
    private String name;
    private int age;

    //constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //method
    public void introduce() {
        System.out.println("Hello,my name is " + name + "and I am " + age + "years old.");
    }

    //setters and getters
    public String getname(){
        return name;}
    public void setname(String name){
        this.name=name;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
}

// Production class

public class TestInheritanceAssign1 {
    public static void main(String[] args) {

        Person obj=new Person("Ram",30);
        obj.introduce();
        obj.setname("Shyam");
        System.out.println(obj.getname());
        obj.setage(30);
        System.out.println(obj.getage());




    }
}