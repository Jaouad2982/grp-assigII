package secondTask;
public class Main {
    public static void main(String[]args){
        double []listOfMarks = {99,99,99};
        double []listOfMarksTwo={99,99,99,99,99};
        Marks marks = new A(listOfMarks);
        Marks marks2 = new B(listOfMarksTwo);
        ((A) marks).setMarks(listOfMarks);
        ((B) marks2).setMarks(listOfMarksTwo);
        validation(listOfMarks,marks);
        validation(marks2,listOfMarksTwo);
    }
    public static void print(Marks m){
        m.getRes();
    }
    public static void validation(double [] arr,Marks marks){
        try{
            if(arr.length<= 3 ){
                print(marks);
            }else{
                throw new IndexOutOfBoundsException("only three grades are allowed");
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Exceed the number of grades allowed for calculation for class A grades");
        }
    }
    public static void validation(Marks marks2,double []arr){
        try{
            if(arr.length<= 4 ){
                print(marks2);
            }else{
                throw new IndexOutOfBoundsException("only four grades are allowed");
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Exceed the number of grades allowed for calculation for Class B grades");
        }
    }
    }



