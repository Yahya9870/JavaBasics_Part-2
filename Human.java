/** Object is the parent of all classes including Human
 * in object class equals() method present, so definitely we can override it in the
 * human class using @Override annotation.
 */


public class Human {


    private String name;
    private int age;
    // Parametrized Constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding the equals method.
    @Override
    public boolean equals(Object obj) {
        // check if the object is equal is compared with itself or not
        if(this ==obj){
            return true;
        }

        // To check if the object is an instance of Human
        if(obj instanceof Human){
            Human obj1 = (Human)obj;
            // Compare the name and age

            return this.name.equals(obj1.name) && this.age == obj1.age;
        }

        return false;
    }

    public static void main(String[] args) {
        Human human1 = new Human("Sushil", 30);
        Human human2 = new Human("Sushil", 30);
        Human human3 = new Human("Bob", 25);

        System.out.println("Human1 equals Human2: " + human1.equals(human2)); // It should print true.
        System.out.println("Human1 equals Human3: " + human1.equals(human3)); // it should print false.
    }
}
