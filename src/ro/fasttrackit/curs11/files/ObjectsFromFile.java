package ro.fasttrackit.curs11.files;

import ro.fasttrackit.curs11.homework.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectsFromFile {
    public static void main(String[] args) throws Exception{
        List<Person> persons =  readObjectsFromFile();
        System.out.println(persons);

        writePersonsToFile(persons);
        writeReport(persons);
    }

    private static void writeReport(List<Person> persons) throws Exception {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file/persons.out"))){
            for (Person person : persons) {
                if(person.getAge() > 18) {
                    writer.write("Major person  " + person);
                    writer.newLine();
                }
            }
        }
    }

    private static void writePersonsToFile(List<Person> persons) throws Exception{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("files/persons.out"))){
            for (Person person : persons){
                String line = personToSring(person);
                writer.write(line);
                writer.newLine();
            }
        }
    }

    private static String personToSring(Person person){
        return person.getName() + ";" + person.getPosition() + ";" + person.getAge();
    }

    private static List<Person> readObjectsFromFile() throws Exception{
        List<Person> persons = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader("files/persons.data"));
        String line;
        while ((line = fileReader.readLine()) !=null){
            persons.add(readPerson(line));
        }
        return persons;
    }

    private static Person readPerson(String personInfo){
        String[] personData = personInfo.split("~");

        String name = personData[0];
        int age = Integer.parseInt(personData[1]);
        String position = personData[2];

        return new Person(name, age, position);
    }
}
