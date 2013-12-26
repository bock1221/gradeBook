package gradebook;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeBook {

    public ArrayList<Student> students = new ArrayList<Student>();
    public String input;
    public Stu
    public void controler() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter you want to do:\n"
                + "To add a student write 'add': \n"
                + "To look up average write 'average' :\n"
                + "To add a grade to an existing student write 'addgrade' :\n"
                + "to look up all of a students grades write 'grades':");

        input = scanner.next();
        String more = "y";
        while (more.equalsIgnoreCase("y")) {
            if (input.equals("add")) {
                System.out.print("please enter name of student you wish to add ");
            } else {
                System.out.print("please enter students name: ");
            }

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
                            System.out.println("student already exists");
                            break;
                        case "grades":
                            System.out.print(student.name + " ");
                            student.getGrades();
                            System.out.println();
                            break iter;
                        case "addgrade":
                            addAGrade(student, scanner);
                            System.out.println();
                            break iter;
                        default:
                            System.out.println("sorry not a valid input");
                    }
                }
            }

            if (input.equals("add") && i != 1) {
                addStudent(name, scanner);
            } else if (i != 1) {
                System.out.println("no such student in our records");
            }
            System.out.println("would you like to continue with different student y/n");
            more = scanner.next();
        }
    }

    public void newStudent(Student student) {

        students.add(student);
    }

    public void average(Student student) {
        System.out.println(student.name + ": " + student.getAverage());
    }

    public void printRecord(Student student) {

        System.out.println(student.getName() + ": " + student.getAverage());
    }

    public void addStudent(String name, Scanner scanner) {
        Student student = new Student(name);
        addAGrade(student, scanner);
        newStudent(student);
    }

    public void addAGrade(Student student, Scanner scanner) {
        System.out.println("please enter a grades when done enter any letter to exit");
        // String answer = "y";
        while (scanner.hasNextInt()) {
            int grade = scanner.nextInt();
            scanner.nextLine();
            student.addGrade(grade);
            System.out.println();
            System.out.println("please enter a grades when done enter any letter to exit");
        }
        scanner.nextLine();
         
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        GradeBook gradebook = new GradeBook();
        String more="y";
        while(more.equals("y")) {
            gradebook.controler();
                   System.out.println(" would you like to return to main menu y/n "
                   + " if you enter 'n' you will exit the program"); 
                     more=scanner.next();
                     System.out.println();
        }
    }
}
