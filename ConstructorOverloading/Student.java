package ConstructorOverloading;
public class Student{
    String name;
    int age;

    public Student(String name){
        this.name = name;
        this.age = 18;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

}