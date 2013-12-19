package gradebook;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GradeBook {

    public ArrayList<Student> students = new ArrayList<Student>();
    public String input;
    static Scanner scanner = new Scanner(System.in);

    public void newStudent(Student student) {

        students.add(student);
    }

    public void checkRecord() {

        System.out.print("please enter students name: ");
        String name = scanner.next();
        int i = 0;
        iter:
        for (Student student : students) {
          
            if (student.name.equals(name)) {
                i++;
                switch (input) {
                    case "average":
                        average(student);
                        System.out.println();
                        break iter;
                    case "add":
                        addAGrade(student);
                        System.out.println();
                        break iter;
                    case "grades":
                        System.out.print(student.name + " ");
                        student.getGrades();
                        System.out.println();
                        break iter;
                    case "addgrade":
                        addAGrade(student);
                        System.out.println();
                        break iter;
                       
                }

            }  if (i!=1) {
                System.out.print("no such name in our records");
            }
        }
    }

    public void average(Student student) {
        System.out.println(student.name + ": " + student.getAverage());
    }

    public void printRecord(Student student) {

        System.out.println(student.getName() + ": " + student.getAverage());
    }

    public void controler() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter you want to do:\n"
                + "To add a student write 'add': \n"
                + "To look up average write 'average' :\n"
                + "To add a grade to an existing student write 'addgrade' :\n"
                + "to look up all of a students grades write 'grades':");

        input = scanner.next();
        switch (input) {
            case "add":
                System.out.println("please enter new students name");
                String newStudent = scanner.next();
                Student student = new Student(newStudent);
                addAGrade(student);
                newStudent(student);
                break;
            case "average":
            case "addgrade":
            case "grades":
                checkRecord();
                break;
        }
    }

    public void addAGrade(Student student) {
System.out.println("please enter a grades when done enter any letter to exit");
       // String answer = "y";
        while (scanner.hasNextInt()) {
            int grade = scanner.nextInt();
            scanner.nextLine();
            student.addGrade(grade);
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("please enter a grades when done enter any letter to exit");
           }
    }

    public static void main(String[] args) {

        GradeBook gradebook = new GradeBook();
        for (;;) {
            gradebook.controler();

        }
    }
}
