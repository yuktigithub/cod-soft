package com.task2;

import java.util.Scanner;



public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student grade calculator!\n");
        System.out.print("Enter your name: ");
        String stuName = sc.nextLine();
        System.out.print("Enter the total number of subjects: ");
        int totalSubjects = sc.nextInt();
        int[] marks = new int[totalSubjects];
        int totalMarks = 0;
        double avgPercentage = 0d;
        char grade;
        for(int i=1; i<=totalSubjects; i++){
            System.out.print("Enter the marks of subject "+i+" out of 100: ");
            marks[i-1] = sc.nextInt();
            totalMarks+= marks[i-1];
        }
        avgPercentage = (double)(totalMarks/totalSubjects);
        System.out.println("Your average percentage is: "+avgPercentage+"%");
        if(avgPercentage >= 90 && avgPercentage <= 100){
            grade = 'A';
            System.out.println("You got \"A\" grade!\n");

        } else if (avgPercentage >= 80 && avgPercentage < 90) {
            grade = 'B';
            System.out.println("You got \"B\" grade!\n");

        } else if (avgPercentage >= 70 && avgPercentage < 80) {
            grade = 'C';
            System.out.println("You got \"C\" grade!\n");
        }else if (avgPercentage >= 60 && avgPercentage < 70){
            grade = 'D';
            System.out.println("You got \"D\" grade!\n");
        }else{
            grade = 'E';
            System.out.println("You got \"E \" grade!\n");
        }
        sc.close();
        Student student = new Student(stuName, totalMarks, avgPercentage, grade);
        System.out.println(student.toString());

    }

}
