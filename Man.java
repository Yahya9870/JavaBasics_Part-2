public class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Man{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        Man obj = new Man("Alice", 30);

        // Directly printing the object (implicit toString() call)
        System.out.println(obj); // Output: Person{name='Alice', age=30}

        // Explicitly calling the toString() method (optional)
        System.out.println(obj.toString()); // Output: Person{name='Alice', age=30}
    }
}
