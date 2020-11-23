public class Circle implements Shape{
    private final static double PIValue = Math.PI;
    private double radius;
    public double getRadius(){
        return this.radius;
    }
    @Override
    public double calcualeArea() {
        return PIValue * (Math.pow(radius,2));
    }

    @Override
    public double calculatePerimeter() {
        return 2*PIVALUE*radius;
    }
}
