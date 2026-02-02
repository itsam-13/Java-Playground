package OOPS;

public class PassingClassesToMethods {

    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        int torque;

        void print(){
            System.out.println(seats+" "+name+" "+length+" "+type+" "+torque);
        } //method
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.seats = 4;
        c1.name = "Thar";
        c1.length = 4.0;
        c1.type = "SUV";
        c1.torque = 5;

//        change(c1);
        System.out.println(c1.seats);
        c1.print();
    }

//    private static void change(Car c1){
//        c1.seats = 4; //The change made here will be reflected above
//    }

//    private static void change(Car x){
//        x.seats = 4; //this pointing same to c1... pass by reference
//    }
}