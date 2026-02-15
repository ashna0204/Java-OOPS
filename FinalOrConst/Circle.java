package FinalOrConst;

public class Circle {
    
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return Constants.PI*radius*radius;
    }
}
