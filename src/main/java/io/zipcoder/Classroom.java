package io.zipcoder;

public class Classroom {

    private int maxNumberOfStudents;

    Student[] students;

    public Classroom(int maxNumberOfStudents){
        this.maxNumberOfStudents = maxNumberOfStudents;
        students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Classroom(){
        Student[] students = new Student[30];
    }

    public Student[] getStudents(){
        return this.students;
    }

    public void addStudent(Student student){
        for(int i = 0; i < students.length; i++){
            if(students[i] == null){
                students[i] = student;
                break;
            }

        }
    }

    public double getAverageExamScore(){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < students.length; i++){
            while(students[i] != null){
                count++;
                sum += students[i].getAverageExamScore();
                break;
            }
        }
        return sum/count;
    }

    public void removeStudent(String firstName, String lastName){
        int count = 0;
        int temp = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i].getFirstName().equals(firstName)
            && students[i].getLastName().equals(lastName)){
                students[i] = null;
                temp = i;
                count = i;
            }
        }

        boolean sorted = false;
        Student swap = null;
        while(!sorted){
            sorted = true;
            for(int j = 0; j < students.length - 1; j++){
                if (students[j] == null){
                    swap = students[j];
                    students[j] = students[j+1];
                    students[j+1] = swap;
                    sorted = false;
                }
            }
        }
//        for(int j = temp + 1; j < students.length; j++){
//            if(students[j] == null){
//                students[count] = students[j-1];
//                students[j-1] = null;
//            }
//        }
    }

    public void getStudentsByScore(){

    }

    public void getGradeBook(){

    }
}
