public class Square implements Shape{
    private double side ;

    public void setSide(double side){
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    @Override
    public double calcuateArea() {
        return Math.pow(this.side,2);
    }

    @Override
    public double calculatePerimeter() {
        return 4*this.side;
    }
    public String toString(){
        return "the Area is " + calcuateArea() +"\n" + "the perimter is " + calculatePerimeter();
    }
}
