public class Car {
    
    // properties 
    private int doors;
    private int tyres;
    private int speed;
    private String color;
    
    // Constructor
    public Car(int doors, int tyres, String color) {
        this.doors = doors;
        this.tyres = tyres;
        this.speed = 0;
        this.color = color;
    }
    
    // behaviours
    public void start() {
        System.out.println("Starting the Car!!");
    }
    
    public void accelerate(int speed) {
        this.speed += speed; // add speed sent by the driver to the speed property of the class
        System.out.println("Accelerated the Car by a speed of " + speed);
    }
    
    public void display() {
        System.out.println("Car with doors="+doors+", tyres="+tyres+", speed="+speed+", color="+color);
    }
}
// car->0 , car->x (x sent by driver)
