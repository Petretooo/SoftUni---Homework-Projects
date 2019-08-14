import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        double a = Double.parseDouble(in.nextLine());
        double b = Double.parseDouble(in.nextLine());


        triangle t = new triangle(a, b);

        System.out.println("The hypotenuse of triangle is: " + t.formula(a, b));
    }
}
