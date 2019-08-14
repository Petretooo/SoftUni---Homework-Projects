import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int price = Integer.parseInt(in.nextLine());
        String brand = in.nextLine();
        String model = in.nextLine();
        String country = in.nextLine();

        Car lekaKola = new Car(price, brand, model, country);

        lekaKola.outPut(price, brand, model, country);

    }
}
