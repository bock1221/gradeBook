package gradebook;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GradeBook {

    /**
     *
     */
    public ArrayList<Student> students = new ArrayList<Student>();
   
    /**
     *
     */
    public String input;
    public Student student;
    //public String input;
    // public static Student s2;
    public String record;
    static Scanner scanner = new Scanner(System.in);

    public void gradebooks() {

        students.add(student);
        //students.add(s2);
    }

    public void checkRecord() {
        //Scanner scanner = new Scanner(System.in);
        System.out.print("please enter students name: ");
        String name = scanner.next();
        System.out.println(name);
        int i = 1;
       // while (i < students.size()) {
            for (Student searching : students) {
                i++;
                if (searching.name.equals(name)) {
                    switch (input) {
                        case "average":
                            average(searching);
                            break;
                        case "add":
                            addAGrade();
                            break;
                        case "grades":
                            System.out.print(searching.name + " ");
                            searching.getGrades();
                            break;}
                    
                } else if (i==students.size())
                                    System.out.print("no such name in our records");

                  }
        }

    public void average(Student searching) {
        System.out.println(searching.name + ": " + searching.getAverage());
        return;
    }

    public void printRecord(Student searching) {
        String names = searching.name;

        if (record.equals(names)) {
           
            System.out.println(searching.getName() + ": " + searching.getAverage());
            controler();
        } else {
           
            System.out.println("name does not match any of our records");


        }
    }

    public void controler() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter you want to do:\n"
                + "To add a student write 'add': \n"
                + "To look up average write 'average' :\n"
                + "To add a grade to an existing student write 'addgrade' :\n"
                + "to look up all of astudents grades write grades");

        input = scanner.next();
        switch (input) {
            case "add":
                System.out.println("please enter new students name");
                String newStudent = scanner.next();
                System.out.println(newStudent);
                student = new Student(newStudent);
                addAGrade();
                gradebooks();
                break;
            case "average":
            case "addgrade":
            case "grades":
                checkRecord();
                break;

          
        }
    }

    public void addAGrade() {

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
