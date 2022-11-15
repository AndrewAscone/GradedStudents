package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert.*;

public class StudentTest {
    @Test
    public void getExamScoresTest() {
    // : Given
    String firstName = "Leon";
    String lastName = "Hunter";
    Double[] examScores = {100.0, 95.0, 123.0, 96.0};
    ArrayList<Double> examScoreList = new ArrayList<>(List.of(examScores));
    Student student = new Student(firstName, lastName, examScoreList);
    String expected = "Exam Scores: \n\tExam 1 -> 100\n\tExam 2 -> 95\n\tExam 3 -> 123\n\tExam 4 -> 96\n";

    // When
    String actual = student.getExamScores();

    // Then
    System.out.println(actual);
    Assert.assertEquals(actual, expected);
    }

    @Test
    public void addExamScoreTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        ArrayList<Double> examScoreList = new ArrayList<>(List.of(examScores));
        Student student = new Student(firstName, lastName, examScoreList);
        String expected = "Exam Scores: \n\tExam 1 -> 100\n";

        // When
        student.addExamScore(100);
        String actual = student.getExamScores();

        // Then
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setExamScoreTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0 };
        ArrayList<Double> examScoreList = new ArrayList<>(List.of(examScores));
        Student student = new Student(firstName, lastName, examScoreList);
        String expected = "Exam Scores: \n\tExam 1 -> 150\n";

        // When
        student.setExamScores(0, 150);
        String actual = student.getExamScores();

        // Then
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScore(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        ArrayList<Double> examScoreList = new ArrayList<>(List.of(examScores));
        Student student = new Student(firstName, lastName, examScoreList);

        // When
        Double actual = student.getAverageExamScore();
        Double expected = 125.0;

        // Then
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        ArrayList<Double> examScoreList = new ArrayList<>(List.of(examScores));
        Student student = new Student(firstName, lastName, examScoreList);

        // When
        String output = student.toString();

        // Then
        System.out.println(output);
    }
}