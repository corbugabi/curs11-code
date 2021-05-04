package ro.fasttrackit.curs11.homework;

import java.util.List;

public class BascketMain {
    public static void main(String[] args) {
        Bascket bascket = new Bascket(List.of(
                "mar",
                "para",
                "struguri",
                "banana",
                "mar"
                ));

        System.out.println(bascket.find("struguri"));
        System.out.println(bascket.find("portocala"));

        System.out.println(bascket.remove("struguri"));
        System.out.println(bascket.remove("portocala"));

        System.out.println(bascket.getPositions("mar"));

        System.out.println(bascket.count());
    }
}
