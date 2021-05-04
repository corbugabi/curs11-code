package ro.fasttrackit.curs11.homework;

import java.util.List;

public class CompanyMain {
    public static void main(String[] args) {
        Company company = new Company(
                "FasttrackIT",
                List.of(
                        new Person("Florin",40,"manager"),
                        new Person("Ana",26,"hr"),
                        new Person("Dariu",50,"trainer")
                )
        );

        System.out.println(company.getManager());
        System.out.println(company.getPersonOlder(30));
    }
}
