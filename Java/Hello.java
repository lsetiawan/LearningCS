/**
 * Hello World Java
 */
public class Hello {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Hello world!");
        System.out.print("My name is ");
        System.out.println("Don.");
        System.out.println();
        System.out.println(++x);
        // y--;
        // System.out.println(y);
        int z = (x++) * (y--);
        System.out.println(z);
    }
}