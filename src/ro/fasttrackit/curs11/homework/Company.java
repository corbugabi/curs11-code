package ro.fasttrackit.curs11.homework;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final String name;
    private final List<Person> employees;

    public Company(String name,Person manager){
        this(name,List.of(manager));
    }

    public Company(String name, List<Person> employees){
        this.name = name;
        this.employees = new ArrayList<>();
        this.employees.addAll(employees);
    }

    public String getName() {
        return name;
    }

    public Person getManager(){
        for(Person employee : employees){
            if("manager".equals(employee.getPosition()));
            return employee;
        }
        return null;
    }

    public List<Person> getPersonOlder(int minAge){
        List<Person> result = new ArrayList<>();
        for (Person employee : employees){
            if(employee.getAge() >minAge){
                result.add(employee);
            }
        }
        return result;
    }
}
