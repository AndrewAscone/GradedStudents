package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ClassroomTest {

    @Test
    public void addStudentTest(){
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        ArrayList<Double> examScoreList = new ArrayList<>(List.of(examScores));
        Student student = new Student("Leon", "Hunter", examScoreList);

        // When
        Student[] preEnrollment = classroom.getStudents();
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();

        // Then
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }

    @Test
    public void averageExamScoreTest(){
        // : Given
        Double[] s1Scores = { 100.0, 150.0 };
        ArrayList<Double> s1ScoreList = new ArrayList<>(List.of(s1Scores));
        Double[] s2Scores = { 225.0, 25.0 };
        ArrayList<Double> s2ScoreList = new ArrayList<>(List.of(s2Scores));

        Student s1 = new Student("student", "one", s1ScoreList);

        Student s2 = new Student("student", "two", s2ScoreList);


        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        double actual = classroom.getAverageExamScore();
        double expected = 125.0;

        // Then
        assertEquals(expected, actual, .001);
    }

    @Test
    public void removeStudentTest(){
        Double[] s1Scores = { 100.0, 150.0 };
        ArrayList<Double> s1ScoreList = new ArrayList<>(List.of(s1Scores));
        Double[] s2Scores = { 225.0, 25.0 };
        ArrayList<Double> s2ScoreList = new ArrayList<>(List.of(s2Scores));
        Double[] s3Scores = { 100.0, 150.0 };
        ArrayList<Double> s3ScoreList = new ArrayList<>(List.of(s1Scores));
        Double[] s4Scores = { 225.0, 25.0 };
        ArrayList<Double> s4ScoreList = new ArrayList<>(List.of(s2Scores));
        Double[] s5Scores = { 100.0, 150.0 };
        ArrayList<Double> s5ScoreList = new ArrayList<>(List.of(s1Scores));

        Student s1 = new Student("student", "one", s1ScoreList);
        Student s2 = new Student("student", "two", s2ScoreList);
        Student s3 = new Student("student", "three", s3ScoreList);
        Student s4 = new Student("student", "four", s4ScoreList);
        Student s5 = new Student("student", "five", s5ScoreList);

        Student[] students = {s1, s2, s3, s4, s5};
        Classroom classroom = new Classroom(students);

        classroom.removeStudent("student", "two");

        Student[] actual = classroom.getStudents();
        String removed = Arrays.toString(actual);

        Student[] expected = {s1, s3, s4, s5, null};

        System.out.println(removed);
        Assert.assertArrayEquals(actual, expected);
    }
}
