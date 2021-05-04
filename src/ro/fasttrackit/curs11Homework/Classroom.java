package ro.fasttrackit.curs11Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.List.of;

public class Classroom {
    private final List<StudentGrade> studentGrade;

    public Classroom(List<StudentGrade> studentGrades){
        this.studentGrade = new ArrayList<>();
        this.studentGrade.addAll(studentGrades);
    }

    public int getWorstGrade(String discipline){
        List<Integer> result = new ArrayList<>();
        for (StudentGrade student : studentGrade){
            if(discipline.equals(student.getDiscipline())){
                result.add(student.getGrade());
            }
        }
        int min;
        min =Collections.min(result);
        return min;
    }

    public Integer getAverageGrade(String discipline){
        int COUNT = 0;
        int sum = 0;
        List<Integer> result = new ArrayList<>();
        for (StudentGrade student : studentGrade){
            if(discipline.equals(student.getDiscipline())){
                result.add(student.getGrade());
            }
        }

        while (COUNT < result.toArray().length){
            sum += result.get(COUNT);
            COUNT++;
        }

        Integer average = sum/result.toArray().length;
        return average;


    }

    public int getMaxGrade(String discipline){
        List<Integer> result = new ArrayList<>();
        for (StudentGrade student : studentGrade){
            if(discipline.equals(student.getDiscipline())){
                result.add(student.getGrade());
            }
        }
        int max;
        max =Collections.max(result);
        return max;
    }

    public List<Integer> getGradesForStudent(String studentul){
        List<Integer> result = new ArrayList<>();
        for (StudentGrade student : studentGrade){
            if(studentul.equals(student.getName())){
            result.add(student.getGrade());
            }
        }
        return result;
    }

    public List<Integer> getGradesForDiscipline(String discipline){
        List<Integer> result = new ArrayList<>();
        for (StudentGrade student : studentGrade){
            if(discipline.equals(student.getDiscipline())){
            result.add(student.getGrade());
            }
        }
        return result;
    }
}
