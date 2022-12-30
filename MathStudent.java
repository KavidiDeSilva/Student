import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class MathStudent extends Student {
  // Private fields to store Math student grades
  private double quizAverage;
  private double test1Grade;
  private double test2Grade;
  private double finalExamGrade;

  // Constructor to initialize student data and Math student grades
  public MathStudent(String firstName, String lastName, double quizAverage, double test1Grade, double test2Grade, double finalExamGrade) {
    super(firstName, lastName, "Math");
    this.quizAverage = quizAverage;
    this.test1Grade = test1Grade;
    this.test2Grade = test2Grade;
    this.finalExamGrade = finalExamGrade;
  }

  // Public getter methods to access Math student grades from outside the class
  public double getQuizAverage() {
    return quizAverage;
  }

  public double getTest1Grade() {
    return test1Grade;
  }

  public double getTest2Grade() {
    return test2Grade;
  }

  public double getFinalExamGrade() {
    return finalExamGrade;
  }

  // Public method to calculate and return the student's final average
  public double calculateAverage() {
    return (quizAverage * 0.15) + (test1Grade * 0.3) + (test2Grade * 0.2) + (finalExamGrade * 0.35);
  }


  
}
