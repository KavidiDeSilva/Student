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
	  
	//read data from the input file
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

		//Print size of the array and Student data
		System.out.println("Total students: " + students.size());
		System.out.println(" ");

	  	for (Student student : students) {
		  if (student instanceof EnglishStudent) {
		    EnglishStudent englishStudent = (EnglishStudent) student;
		    System.out.println("English Student: " + student.getFirstName() + " " + student.getLastName());
		    System.out.println("Final Average: " + englishStudent.calculateAverage() + ", Letter Grade: " + student.calculateLetterGrade(englishStudent.calculateAverage()));
		    System.out.println(" ");
		  }
		}
		for (Student student : students) {
		  if (student instanceof ScienceStudent) {
		    ScienceStudent scienceStudent = (ScienceStudent) student;
		    System.out.println("Science Student: " + student.getFirstName() + " " + student.getLastName());
		    System.out.println("Final Average: " + scienceStudent.calculateAverage() + ", Letter Grade: " + student.calculateLetterGrade(scienceStudent.calculateAverage()));
		    System.out.println(" ");
		  }
		}
		for (Student student : students) {
		  if (student instanceof MathStudent) {
		    MathStudent mathStudent = (MathStudent) student;
		    System.out.println("Math Student: " + student.getFirstName() + " " + student.getLastName());
		    System.out.println("Final Average: " + mathStudent.calculateAverage() + ", Letter Grade: " + student.calculateLetterGrade(mathStudent.calculateAverage()));
		    System.out.println(" ");
		  }
		}
		
	//output file
    	try {
  	// Open a file for writing
	  PrintWriter outputFile = new PrintWriter("output.txt");

	  for (Student student : students) {
	    if (student instanceof EnglishStudent) {
	      EnglishStudent englishStudent = (EnglishStudent) student;
	      outputFile.println("Subject: English");
	      outputFile.println("Student: " + student.getFirstName() + " " + student.getLastName());
	      outputFile.println("Final Average: " + englishStudent.calculateAverage());
	      outputFile.println("Letter Grade: " + student.calculateLetterGrade(englishStudent.calculateAverage()));
	      outputFile.println(" ");
	    } else if (student instanceof ScienceStudent) {
	      ScienceStudent scienceStudent = (ScienceStudent) student;
	      outputFile.println("Subject: Science");
	      outputFile.println("Student: " + student.getFirstName() + " " + student.getLastName());
	      outputFile.println("Final Average: " + scienceStudent.calculateAverage());
	      outputFile.println("Letter Grade: " + student.calculateLetterGrade(scienceStudent.calculateAverage()));
	      outputFile.println(" ");
	    } else if (student instanceof MathStudent) {
	      MathStudent mathStudent = (MathStudent) student;
	      outputFile.println("Subject: Math");
	      outputFile.println("Student: " + student.getFirstName() + " " + student.getLastName());
	      outputFile.println("Final Average: " + mathStudent.calculateAverage());
	      outputFile.println("Letter Grade: " + student.calculateLetterGrade(mathStudent.calculateAverage()));
	      outputFile.println(" ");
	    }
  }


	  // Close the file when you are done writing
	  outputFile.close();

	} catch (FileNotFoundException e) {
	  System.out.println("Error: Unable to create output file");
	}

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
	
 //public void printGradeDistribution(PrintWriter writer, List<Student> students) {

	//     // Initialize counters for each letter grade
	//     int aCount = 0;
	//     int bCount = 0;
	//     int cCount = 0;
	//     int dCount = 0;
	//     int fCount = 0;

	//     // Count the number of students with each letter grade
	//     for (Student student : students) {
	//         String letterGrade = student.calculateLetterGrade(englishStudent.calculateAverage());
	//         switch (letterGrade) {
	//             case "A":
	//                 aCount++;
	//                 break;
	//             case "B":
	//                 bCount++;
	//                 break;
	//             case "C":
	//                 cCount++;
	//                 break;
	//             case "D":
	//                 dCount++;
	//                 break;
	//             case "F":
	//                 fCount++;
	//                 break;
	//         }
	//     }
	//     for (Student student : students) {
	//         String letterGrade = student.calculateLetterGrade(scienceStudent.calculateAverage());
	//         switch (letterGrade) {
	//             case "A":
	//                 aCount++;
	//                 break;
	//             case "B":
	//                 bCount++;
	//                 break;
	//             case "C":
	//                 cCount++;
	//                 break;
	//             case "D":
	//                 dCount++;
	//                 break;
	//             case "F":
	//                 fCount++;
	//                 break;
	//         }
	//     }
	//     for (Student student : students) {
	//         String letterGrade = student.calculateLetterGrade(mathStudent.calculateAverage());
	//         switch (letterGrade) {
	//             case "A":
	//                 aCount++;
	//                 break;
	//             case "B":
	//                 bCount++;
	//                 break;
	//             case "C":
	//                 cCount++;
	//                 break;
	//             case "D":
	//                 dCount++;
	//                 break;
	//             case "F":
	//                 fCount++;
	//                 break;
	//         }
	//     }

	//     // Print the grade distribution
	//     writer.println("\nGrade Distribution");
	//     writer.printf("A: ", aCount);
	//     writer.printf(" ");
	//     writer.printf("B: ", bCount);
	//     writer.printf(" ");
	//     writer.printf("C: ", cCount);
	//     writer.printf(" ");
	//     writer.printf("D: ", dCount);
	//     writer.printf(" ");
	//     writer.printf("F: ", fCount);
	// }



}




