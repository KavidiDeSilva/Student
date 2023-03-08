# Student
This code is for a student record keeping system. The base class "Student" has methods for reading student data from a file, checking for emptiness, printing data to a file, calculating letter grades, and printing a grade distribution. 

The derived classes "EnglishStudent", "ScienceStudent", and "MathStudent" have methods for calculating grades based on specific criteria for each subject. To run the file, navigate to the file path in the command prompt and use the commands "javac" to compile the code and "java Student" to execute it.


## Challenge 4

Student (Base Class)

    |_main();
       |_write text to a file (input.txt)
            first line no of students
            after first line (Student entry with two lines) 

				lastName, firstName 
				course (“English”, “Science”, or “Math”) - "Science 95 85 80 90 "

       |_Check emptiness
       |_Print size of the array and Student data
       |_Output data to a file (output.txt)
       |_Print a grade distribution 
  
    |_calculateLetterGrade();

    |_printGradeDistribution(); !



EnglishStudent (Derived classes)

		|_getTermPaperGrade();
		|_getMidtermGrade();
		|_getFinalExamGrade();
		|_calculateAverage();

ScienceStudent (Derived classes)

		|_getAttendanceGrade();
		|_getProjectGrade();
		|_getMidtermGrade();
		|_getFinalExamGrade();
		|_calculateAverage();

MathStudent (Derived classes)

		|_getQuizAverage();
		|_getTest1Grade();
		|_getTest2Grade();
		|_getFinalExamGrade();
		|_calculateAverage();



On CMD (To run the file)

1. cd (filepath)

2. javac Student.java EnglishStudent.java ScienceStudent.java MathStudent.java

3. java Student






