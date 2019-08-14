package chapter10.examples;

import chapter10.Cat;

import java.util.*;

public class exmples {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        String color = in.nextLine();

        Cat catie = new Cat(name, color);


        System.out.printf("This Cat has %s color and the name is %s", catie.getColor(), catie.getName());


    }


}
