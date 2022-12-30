import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;


public class Student {
  // Private fields to store student data
  private String firstName;
  private String lastName;
  private String course;

  // Constructor to initialize student data
  public Student(String firstName, String lastName, String course) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.course = course;
  }

  // Public getter methods to access student data from outside the class
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getCourse() {
    return course;
  }


  public static void main(String[] args) {

  	List<Student> students = new ArrayList<>();

	//read data from the input file
    	try (FileWriter writer = new FileWriter("input.txt")) {
    		//didn't connected to input file so wrote data to input file
        	writer.write("4\n");
        	writer.write("Geller, Monica\n");
        	writer.write("English\n80 90 95\n");
        	writer.write("Doe, Jane\n");
        	writer.write("Science\n95 85 80 90\n");
        	writer.write("Green, Rachel\n");
        	writer.write("Math\n75 85 95 90\n");
        	writer.write("Johnson, Joey\n");
        	writer.write("Math\n75 85 55 70\n");

    	} catch (IOException e) {
        	System.out.println("Error writing to input file: " + e.getMessage());
    	}

	try  {
		// create a scanner for reading the input file
  		Scanner scanner = new Scanner(new File("input.txt"));


		// read the number of students
		int numStudents = Integer.parseInt(scanner.nextLine());

		// read each student's data
		for (int i = 0; i < numStudents; i++) {
		    String[] nameParts = scanner.nextLine().split(", ");
		    String course = scanner.nextLine();
		    String[] gradeParts = scanner.nextLine().split(" ");

		    double[] grades = new double[gradeParts.length];
			for (int d = 0; d < gradeParts.length; d++) {
				grades[d] = Double.parseDouble(gradeParts[d]);
			}

		    Student student;
		    if (course.equals("English")) {
		      student = new EnglishStudent(nameParts[1], nameParts[0], grades[0], grades[1], grades[2]);
		    } else if (course.equals("Science")) {
		      student = new ScienceStudent(nameParts[1], nameParts[0], grades[0], grades[1], grades[2], grades[3]);
		    } else if (course.equals("Math")) {
		      student = new MathStudent(nameParts[1], nameParts[0], grades[0], grades[1], grades[2], grades[3]);
		    } else {
		      continue;
		    }


		    students.add(student);
		}
	} catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
	}

	System.out.println("Total students: " + students.size());



  }
	
	
  public static String calculateLetterGrade(double average) {
    if (average >= 90) {
      return "A";
    } else if (average >= 80) {
      return "B";
    } else if (average >= 70) {
      return "C";
    } else if (average >= 60) {
      return "D";
    } else {
      return "F";
    }
  }
 

}




