package Abstraction;

public class Main {
    
    public static void main(String[] args)
    {
        Shape[] shapes = { new Circle( 6), new Square(8)};
        for(Shape s : shapes)
        {
            System.out.println(s.area());
        }
    }
}
