package chapter10;

import java.util.Scanner;

public class catArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = Integer.parseInt(in.nextLine());


        Cat[] someCat = new Cat[size];


        for (int i = 0; i < someCat.length; i++) {

            String name = in.nextLine();
            String color = in.nextLine();

            someCat[i] = new Cat(name, color);
        }

        for (int i = 0; i < someCat.length; i++) {

            System.out.printf("Cat with name %s is %s", someCat[i].getName(), someCat[i].getColor());
            someCat[i].sayMiau();
        }


    }
}
