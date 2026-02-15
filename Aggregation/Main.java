package Aggregation;

public class Main {
    public static void main(String[] args){
        Address addr = new Address("Kochi", "Kerala");
        Employee emp = new Employee("Alice", addr);

        System.out.println(emp.name + " lives in " + emp.address.city);
    }
}
