package String;

public class BasicExample {

    public static void main(String[] args) {

        char[] arr = new char[] {'a','b'};

        // String is a class in java
        String s1 = "Hello"; // Literal Definition
        String s3 = "Hello";

        String s2 = new String("Hello"); // Object Definition
        String s4 = new String("Hello");

        System.out.println("S1 : "+s1);
        System.out.println("S2 : "+s2);
        System.out.println("S3 : "+s3);
        System.out.println("S4 : "+s4);
        System.out.println(s1==s3); // ==
        System.out.println(s2==s4); // == checks object reference
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s4)); // .equals() checks value


        s1 += "World";
        System.out.println("S1 : "+s1);
        System.out.println("S3 : "+s3);
    }
}
