package polymorphism;

public class Main {

    public static void main(String[] args)
    {
        Animal[] animal = { new Dog(), new Cat()};

        for(Animal a : animal)
        {
            a.speak();
        }
    }
    
}
