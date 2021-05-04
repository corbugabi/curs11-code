package ro.fasttrackit.curs11Homework;

import java.util.List;

public class MainClassroom {
    public static void main(String[] args) {
        Classroom classroom = new Classroom(List.of(
                new StudentGrade("Ana","matematica",5),
                new StudentGrade("Calin","fizica",8),
                new StudentGrade("Calin","engleza",9),
                new StudentGrade("Ana","matematica",9),
                new StudentGrade("Vivi","matematica",9),
                new StudentGrade("Andrei","sport",10)
        ));

        System.out.println(classroom.getGradesForDiscipline("matematica"));
        System.out.println(classroom.getGradesForStudent("Calin"));
        System.out.println(classroom.getMaxGrade("matematica"));
        System.out.println(classroom.getAverageGrade("matematica"));
    }
}
