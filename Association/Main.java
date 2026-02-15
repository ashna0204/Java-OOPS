package Association;

public class Main {
    public static void main(String[] args){
        Teacher t = new Teacher("Mr. John");
        Student s = new Student("Alice");

        System.out.println(t.name+ " teaches " +s.name+  ".");
    }
}
