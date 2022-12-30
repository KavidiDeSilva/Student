import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class EnglishStudent extends Student {
  // Private fields to store English student grades
  private double termPaperGrade;
  private double midtermGrade;
  private double finalExamGrade;

  // Constructor to initialize student data and English student grades
  public EnglishStudent(String firstName, String lastName, double termPaperGrade, double midtermGrade, double finalExamGrade) {
    super(firstName, lastName, "English");
    this.termPaperGrade = termPaperGrade;
    this.midtermGrade = midtermGrade;
    this.finalExamGrade = finalExamGrade;
	}

	// Public getter methods to access English student grades from outside the class
	public double getTermPaperGrade() {
	  return termPaperGrade;
	}

	public double getMidtermGrade() {
	  return midtermGrade;
	}

	public double getFinalExamGrade() {
	  return finalExamGrade;
	}

	// Public method to calculate and return the student's final average
	public double calculateAverage() {
	  return (termPaperGrade * 0.3) + (midtermGrade * 0.3) + (finalExamGrade * 0.4);
	}


}