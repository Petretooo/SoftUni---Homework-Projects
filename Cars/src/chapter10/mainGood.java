package chapter10;

import java.util.Scanner;

public class mainGood {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String hFraza = in.nextLine();
        String hSluchka = in.nextLine();
        String name = in.nextLine();
        String sName = in.nextLine();
        String city = in.nextLine();

        goodThings thisOne = new goodThings(hFraza, hSluchka, name, sName, city);

        thisOne.output();


    }
}
