package chapter10;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.printf("Sequence[1..3]: %d, %d, %d%n", Sequence.nextValue(), Sequence.nextValue(), Sequence.nextValue());


        String name1 = in.nextLine();
        String color1 = in.nextLine();


        Cat someCat = new Cat(name1, color1);

        someCat.sayMiau();

        System.out.printf("The color of cat %s is %s", someCat.getName(), someCat.getColor());
    }
}
