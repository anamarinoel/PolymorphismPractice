class Car {

    private boolean engine;
    private String name;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngeene() {
        return "Car -> start engeene!";
    }

    public String accelerate() {
        return "Car -> accelerate!";
    }

    public String brake() {
        return "Car -> brake!";
    }

    public String getName() {
    return name;
    }

    public int getCylinders() {
        return cylinders;
    }

}

class Mitsubishi extends Car {

    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngeene() {
        return "Car -> start engeene!";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> start accelerate!";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> start brake!";
    }
}

public class Main {

    public static void main (String[] args) {

        Car car = new Car("neki",8);
        System.out.println(car.startEngeene());
        System.out.println(car.brake());
        System.out.println(car.accelerate());

        Mitsubishi mitsubishi = new Mitsubishi("outlander", 6) ;
        System.out.println(mitsubishi.startEngeene());
        System.out.println(mitsubishi.brake());
        System.out.println(mitsubishi.accelerate());


    }
}
