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
            i++;
            if (student.name.equals(name)) {
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

            } else if (i == students.size()) {
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

        String answer = "y";
        while (answer.equalsIgnoreCase("y")) {
            Scanner scanner = new Scanner(System.in);
            //student=new Student(newStudent);

            System.out.println("please enter a grade");
            int grade = scanner.nextInt();
            scanner.nextLine();
            student.addGrade(grade);
            System.out.println("do you want to enter another grade y/n");
            answer = scanner.next();
            System.out.println();
        }
    }

    public static void main(String[] args) {

        GradeBook gradebook = new GradeBook();
        for (;;) {
            gradebook.controler();

        }
    }
}
