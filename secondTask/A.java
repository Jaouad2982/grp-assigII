package secondTask;

public class A extends Marks {
    private double  [] marks;
    public A(double [] marks){
        this.marks = new double[3];

    }
    public void setMarks(double [] marks){
        this.marks = marks;
    }
    public double [] getMarks(){
        if(this.marks.length >3){
            System.out.println("You are only allowed 4 grades");
        }
        return this.marks;
    }
    @Override
    double getPercentage() {
        double sum = 0;
        for(double elem : this.marks){
            sum+=elem;
        }
        return sum/this.marks.length;
    }

    @Override
    void getRes() {
        System.out.println("The average of your three grades is " + getPercentage());
    }

}
