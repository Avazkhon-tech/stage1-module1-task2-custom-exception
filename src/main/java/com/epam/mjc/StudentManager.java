package com.epam.mjc;


public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) {

      Student valueOf = Student.getValueOf(studentID);
      if (valueOf == null) {
          throw new StudentNotFoundException("Could not find student with ID " + studentID);
      }

      return Student.getValueOf(studentID);
  }

  public static void main(String[] args) throws StudentNotFoundException {
    StudentManager manager = new StudentManager();

    for (int i = 0; i < IDs.length; i++) {
        Student student = null;
        try {
            student = manager.find(IDs[i]);
            System.out.println("Student name " + student.getName());
        } catch (StudentNotFoundException e) {}
    }
  }
}