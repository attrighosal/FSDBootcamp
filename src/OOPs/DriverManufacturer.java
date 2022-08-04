public class DriverManufacturer {
    
    public static void main(String[] args) {
        
        // Manufacturing
        Car suv = new Car(5, 4, "blue");
        suv.display();
        
        // Thief
        // suv.doors = 4;
        
        // Start
        suv.start();
        
        // Accelerate
        suv.accelerate(50);
        
        suv.display();
        
        // Speed After acceleration
        // System.out.println("Speed of the car : " + suv.speed);
    }
}
