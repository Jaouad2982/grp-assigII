package thirdTask;

public abstract class Car {
    private String color;
    private double carPrice;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public double calculateCarPrice(){
        return this.carPrice;
    }
}
