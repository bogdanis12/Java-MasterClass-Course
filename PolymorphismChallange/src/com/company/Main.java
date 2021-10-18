package com.company;

class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels=4;
        this.engine=true;
    }

    public String startEngine(){
        return "The engine is starting";
    }

    public String accelerate(){
        return "The car accelerate";
    }

    public String brake(){
        return "Brake";
    }

    public String getName() {
        return name;
    }

    public String traction(){
        return "Unknown";
    }

    public int getCylinders() {
        return cylinders;
    }

}

class Honda extends Car{
    public Honda() {
        super("NSX", 6);
    }

    @Override
    public String traction() {
        return "RWD";
    }

    @Override
    public String startEngine() {
        return "Honda -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Honda -> accelerate()";
    }

    @Override
    public String brake() {
        return "Honda -> brake()";
    }
}

class Porsche extends Car{
    public Porsche() {
        super("911 GT3 RS", 6);
    }

    @Override
    public String traction() {
        return "4WD";
    }

    @Override
    public String startEngine() {
        return "Porsche -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Porsche -> accelerate()";
    }

    @Override
    public String brake() {
        return "Porsche -> brake()";
    }
}

class Brabus extends Car{
    public Brabus() {
        super("G800", 8);
    }

    @Override
    public String traction() {
        return "6X6";
    }
}

class Dacia extends Car {
    public Dacia() {
        super("Lodgy", 4);
    }
    //no traction added
}
public class Main {

    public static void main(String[] args) {
        Car car = new Car("Base car",8);
        car.startEngine();
        car.accelerate();
        car.brake();

        Honda honda = new Honda();
        System.out.println(honda.accelerate());
        System.out.println(honda.startEngine());
        System.out.println(honda.brake());
        System.out.println(honda.traction());

        for(int i=1;i<11;i++){
            Car car1 = randomCar();
            System.out.println("Car #" + i + " : " + car1.getName() + "\n"
            + "Traction: " + car1.traction() + "\n" + car1.accelerate());
        }

    }

    public static Car randomCar(){
        int randomNumber = (int)(Math.random()*4)+1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Honda();
            case 2:
                return new Porsche();
            case 3:
                return  new Brabus();
            case 4:
                return new Dacia();
    }
    return null;
    }
}

