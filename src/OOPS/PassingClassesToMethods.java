package OOPS;

public class PassingClassesToMethods {
    public static  class Car{
        int seats;
        String name;
        double length;
        String type;

        void print(){
            System.out.println(seats+" " +name+" "+length+" " +type);
        }
    }

    public static void main(String[] args) {
        Car c=new Car();
        c.length=3.99;
        c.name="Safari";
        c.seats=7;
        c.type="SUV";


        Car c2= new Car();
        c2.length=4.99;
        c2.name="PhantomGhost";
        c2.seats=9;
        c2.type="SUV";

        change(c);
        System.out.println(c.seats);
        c.print();
        c2.print();
    }
   public static void change(Car c){

    c.seats=4;

    }
}
