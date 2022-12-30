import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class ScienceStudent extends Student {
  // Private fields to store Science student grades
  private double attendanceGrade;
  private double projectGrade;
  private double midtermGrade;
  private double finalExamGrade;

  // Constructor to initialize student data and Science student grades
  public ScienceStudent(String firstName, String lastName, double attendanceGrade, double projectGrade, double midtermGrade, double finalExamGrade) {
    super(firstName, lastName, "Science");
    this.attendanceGrade = attendanceGrade;
    this.projectGrade = projectGrade;
    this.midtermGrade = midtermGrade;
    this.finalExamGrade = finalExamGrade;
  }

  // Public getter methods to access Science student grades from outside the class
  public double getAttendanceGrade() {
    return attendanceGrade;
  }

  public double getProjectGrade() {
    return projectGrade;
  }

  public double getMidtermGrade() {
    return midtermGrade;
  }

  public double getFinalExamGrade() {
    return finalExamGrade;
  }

  // Public method to calculate and return the student's final average
  public double calculateAverage() {
    return (attendanceGrade * 0.1) + (projectGrade * 0.3) + (midtermGrade * 0.3) + (finalExamGrade * 0.3);
  }

 
}
