public class InheritanceMain {
    
    public static void main(String[] args) {
        SuperCar superCar = new SuperCar(5, 4, "green", 2);
        superCar.display();
        superCar.accelerate(50);
        superCar.display();
        System.out.println("The number of nitros : "+superCar.getNitro());
    }
}
