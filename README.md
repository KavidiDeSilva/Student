# Student
Challenge 4

Student (Base Class)
|    |_main();
|       |_write text to a file (input.txt)
|            first line no of students
|            after first line (Student entry with two lines) 
|				lastName, firstName 
|				course (“English”, “Science”, or “Math”) - "Science 95 85 80 90 "
|
|       |_Check emptiness
|       |_Print size of the array and Student data
|       |_Output data to a file (output.txt)
|       |_Print a grade distribution 
|  
|    |_calculateLetterGrade();
|
|    |_printGradeDistribution(); !
|
|
|
|_EnglishStudent (Derived classes)
		|_getTermPaperGrade();
		|_getMidtermGrade();
		|_getFinalExamGrade();
		|_calculateAverage();
|
|_ScienceStudent (Derived classes)
		|_getAttendanceGrade();
		|_getProjectGrade();
		|_getMidtermGrade();
		|_getFinalExamGrade();
		|_calculateAverage();
|
|_MathStudent (Derived classes)
		|_getQuizAverage();
		|_getTest1Grade();
		|_getTest2Grade();
		|_getFinalExamGrade();
		|_calculateAverage();
------------------------


On CMD (To run the file)

cd (filepath)
javac Student.java EnglishStudent.java ScienceStudent.java MathStudent.java
java Student






