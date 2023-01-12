package class5;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {


        int averageScore;

     Scanner scan=new Scanner(System.in);

        System.out.println("Enter your quiz score");
        int quiz=scan.nextInt();
        System.out.println("Enter your midterm score");
        int midterm=scan.nextInt();
        System.out.println("Enter your final score");
        int finalScore=scan.nextInt();

        averageScore=(quiz+midterm+finalScore)/3;

        if (averageScore>=90){
            System.out.println("Your grade is A");
        } else if (averageScore>=70 && averageScore<90){
            System.out.println("Your grade is B");
        } else if (averageScore>=50 && averageScore<70){
            System.out.println("Your grade is C");
        } else if (averageScore<50){
            System.out.println("Your grade is F");
        }

    }
}
//3) Write a program that will read three inputs of scores
// (quiz, mid term, and final scores) and determine the grade based on the following rules:
//if the average score >=90 → grade=A
//if the average score >= 70 and <90 → grade=B
//if the average score>=50 and <70 → grade=C
//if the average score<50 → grade=F