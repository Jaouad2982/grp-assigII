package secondTask;

public class B extends Marks  {
    private double []marks;
    public B(double []marks) {
        this.marks = new double[4];

    }
    public void setMarks(double [] marks){
        if(this.marks.length >4){
            System.out.println("You are only allowed 4 grades");
        }
        this.marks = marks;
    }
    public double [] getMarks(){
        return marks;
    }

    @Override
    double getPercentage() {
        double sum = 0;
        for(double elem : marks){
            sum+=elem;
        }
        return sum/getMarks().length;
    }

    @Override
    void getRes() {
        System.out.println("The average of your Four grades is " + getPercentage());
    }


}
