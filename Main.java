public class Main {
    public static void main(String[]args) {

        Shape s = new Circle();
        Shape s1 = new Square();
        returnShape((Circle) s); // playing with casting kind of ... :)
        System.out.println(s.toString());
        returnSquare((Square) s1);
        System.out.println(s1.toString());
    }
    public static void returnShape(Circle s){
        s.setRadius(12);
        s.calcuateArea();
        s.calculatePerimeter();
    }

    public static void returnSquare(Square s){
        s.setSide(12);
        s.calcuateArea();
        s.calculatePerimeter();
    }

}
