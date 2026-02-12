
package ConstructorOverloading;
public class Main {
    
    public static void main(String[] args){

        Student s1 = new Student("Alice");
        Student s2 = new Student("Alan", 23);

        System.out.println(s1.name + " - " + s1.age);
        System.out.println(s2.name + " - " + s2.age);
    }
}
