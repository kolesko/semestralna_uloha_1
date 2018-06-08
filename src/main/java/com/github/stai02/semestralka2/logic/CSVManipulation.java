package com.github.stai02.semestralka2.logic;

import java.io.*; 
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVManipulation {

//Delimiter used in CSV file
private static final String COMMA_DELIMITER = ",";
private static final String NEW_LINE_SEPARATOR = "\n";

//CSV file header
private static final String FILE_HEADER = "id,firstName,lastName,gender,age";

public static void writeCsvFile(String fileName) {
      
	//Create new students objects
	Student student1 = new Student(1, "Ahmed", "Mohamed", "M", 25);
	Student student2 = new Student(2, "Sara", "Said", "F", 23);
	Student student3 = new Student(3, "Ali", "Hassan", "M", 24);
	Student student4 = new Student(4, "Sama", "Karim", "F", 20);
	Student student5 = new Student(5, "Khaled", "Mohamed", "M", 22);
	Student student6 = new Student(6, "Ghada", "Sarhan", "F", 21);

	//Create a new list of student objects
	List students = new ArrayList();
	students.add(student1);
	34
	      students.add(student2);
	35
	      students.add(student3);
	36
	      students.add(student4);
	37
	      students.add(student5);
	38
	      students.add(student6);       

FileWriter fileWriter = null;
            
      try {
43
          fileWriter = new FileWriter(fileName);
44

45
          //Write the CSV file header
46
          fileWriter.append(FILE_HEADER.toString());
47
           
48
          //Add a new line separator after the header
49
          fileWriter.append(NEW_LINE_SEPARATOR);
50
           
51
          //Write a new student object list to the CSV file
52
          for (Student student : students) {
53
              fileWriter.append(String.valueOf(student.getId()));
54
              fileWriter.append(COMMA_DELIMITER);
55
              fileWriter.append(student.getFirstName());
56
              fileWriter.append(COMMA_DELIMITER);
57
              fileWriter.append(student.getLastName());
58
              fileWriter.append(COMMA_DELIMITER);
59
              fileWriter.append(student.getGender());
60
              fileWriter.append(COMMA_DELIMITER);
61
              fileWriter.append(String.valueOf(student.getAge()));
62
              fileWriter.append(NEW_LINE_SEPARATOR);
63
          }
64

65
           
66
           
67
          System.out.println("CSV file was created successfully !!!");
68
           
69
      } catch (Exception e) {
70
          System.out.println("Error in CsvFileWriter !!!");
71
          e.printStackTrace();
72
      } finally {     
          try {

              fileWriter.flush();

              fileWriter.close();

          } catch (IOException e) {

              System.out.println("Error while flushing/closing fileWriter !!!");

              e.printStackTrace();
          }    
      }
  }
}

}
