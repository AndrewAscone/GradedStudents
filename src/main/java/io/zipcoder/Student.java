package io.zipcoder;

import java.util.ArrayList;

public class Student {
    private String firstName;

    private String lastName;

    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList <Double>examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        StringBuilder result = new StringBuilder("Exam Scores: \n");
        for(int i = 0; i < this.examScores.size(); i++){
            result.append("\tExam ").append(i + 1).append(" -> ").append(String.format("%.0f",this.examScores.get(i))).append("\n");
        }

        return result.toString();
    }

    public int getNumberOfExamsTaken(){
        return this.examScores.size(); //returns number of exams taken by student
    }

    public void addExamScore(double examScore){
        this.examScores.add(examScore);
    }

    public void setExamScores(int examNumber, double newScore){
        this.examScores.set(examNumber, newScore);
    }

    public double getAverageExamScore(){
        double sum = 0.0;
        for (int i = 0; i < this.examScores.size(); i++){
            sum += this.examScores.get(i);
        }

        return sum/this.examScores.size();
    }

    @Override
    public String toString(){
        return String.format("Student Name: %s %s\n> Average Score: %.0f\n> %s", firstName, lastName, getAverageExamScore() , getExamScores());
    }
}
