public class SuperCar extends Car {
    
    private int nitro;

    public SuperCar(int doors, int tyres, String color, int nitro) {
        super(doors, tyres, color);
        this.nitro = nitro;
    }

    public int getNitro() {
        return this.nitro;
    }
}

// Car -> Super Class
// Super Car -> Sub Class
