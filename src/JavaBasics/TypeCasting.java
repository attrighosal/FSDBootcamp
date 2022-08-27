package JavaBasics;

public class TypeCasting {

    public static void main(String[] args) {
        double d = 5.6;
        int i = (int)d; // Narrowing Type Casting
        double c = i;   // Widening Type Casting
        System.out.println(i);
        System.out.println(c);
    }
}
