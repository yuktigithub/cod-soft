package com.task2;

public class Student {
    String name;
    int totalMarks;
    double percentage;
    char grade;

    public Student(String name, int totalMarks, double percentage, char grade ){
          this.name = name;
          this.percentage = percentage;
          this.totalMarks = totalMarks;
          this.grade = grade;
    }

    @Override
    public String toString() {
        return "\"STUDENT RESULT\"\n" +
                "Name: '" + name + '\'' + "\n"+
                "TotalMarks: " + totalMarks + "\n"+
                "percentage: " + percentage +"%"+ "\n"+
                "Grade: '"+ grade + '\'' ;
    }
}
