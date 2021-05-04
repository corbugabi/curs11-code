package ro.fasttrackit.curs11Homework;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadStudentGrades {
    public static void main(String[] args) throws Exception {
     readStudentGrades();
     readStudentGrade();
    }

    private static void readStudentGrades() throws Exception {
       BufferedReader fileReader = new BufferedReader(new FileReader("files/grades.txt"));
       String line;
       while ((line = fileReader.readLine()) != null) {
           System.out.println(line);
       }
    }

    private static List<StudentGrade> readStudentGrade() throws Exception {
        List<StudentGrade> studentGrades = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader("files/grades.txt"));
        String line;
        while ((line = fileReader.readLine()) != null){
            studentGrades.add(readStudentgrade(line));
        }
        return studentGrades;
    }

    private static StudentGrade readStudentgrade(String studentInfo){
        String[] studentData = studentInfo.split(" | ");
        String name = studentData[0];
        String discipline = studentData[1];
        int grades = Integer.parseInt(studentData[2]);

        return new StudentGrade(name, discipline, grades);
    }

}
