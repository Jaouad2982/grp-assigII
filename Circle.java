public class Circle implements Shape{
    private final static double PIVALUE = Math.PI;
    private double radius;
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    @Override
    public double calcuateArea() {
        return PIVALUE * (Math.pow(radius,2));
    }

    @Override
    public double calculatePerimeter() {
        return 2*PIVALUE*radius;
    }
    public String toString(){
        return "the Area is " + calcuateArea() +"\n" + "the perimter is " + calculatePerimeter();
    }
}
