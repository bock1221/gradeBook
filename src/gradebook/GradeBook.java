package gradebook;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GradeBook {

    /**
     *
     */
    public ArrayList<Student> students = new ArrayList<Student>();
    //public String row ="1";
    /**
     *
     */
    public Student student;
    /**
     *
     */
    //public String input;
    public static Student s2;
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
        int i =0;
       // while( i < students.size()){
        for (Student searching : students) {
            i++;
             if (searching.name.equals(name)) {
                //System.out.println("name does match any of our records");
                 
                System.out.println(searching.getName() + ": " + searching.getAverage());
                break;
            }  
                if(i == students.size()){//System.out.println(searching.getName() + ": " + searching.getAverage());
                //System.out.println("name does match any of our records");
                System.out.println("name does not match any of our records");

                
             }}}
    
    public void add() {
      //  Scanner scanner = new Scanner(System.in);
        System.out.print("please enter students name: ");
        String name = scanner.next();
        System.out.println(name);
        for (Student searching : students) {
            
             if (searching.name.equals(name)) {
              System.out.print("enter grade");
              //scanner.nextInt();
                 searching.addGrade(scanner.nextInt());
                System.out.println(searching.getName() + ": " + searching.getAverage());
               System.out.println("do you want to add another record y/n");
              String answer= scanner.next();
                if(answer.equals("y"))
                    continue;
                
            } else {
                //System.out.println(searching.getName() + ": " + searching.getAverage());
                //System.out.println("name does match any of our records");
                System.out.println("name does not match any of our records");

             }}}
           
        
           public void printRecord(Student searching){
               String names = searching.name;
           
            if (record.equals(names)) {
                //System.out.println("name does match any of our records");
                System.out.println(searching.getName() + ": " + searching.getAverage());
                controler();
            } else {
                //System.out.println(searching.getName() + ": " + searching.getAverage());
                //System.out.println("name does match any of our records");
                System.out.println("name does not match any of our records");

                
            }
        }
    

    public void controler() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" please enter you want to do:");
        System.out.println("To add a student write 'add' ");
        System.out.println("To look up a record write 'record' :");
        System.out.println(" To add a grade to an existing student write addgrade :");

        // Scanner scanner =new Scanner(System.in);
         String input = scanner.next();
        switch (input) {
            case "add":
                System.out.println("please enter new students name");
                String newStudent = scanner.next();
                System.out.println(newStudent);
                student = new Student(newStudent);
                addAGrade(newStudent);
                gradebooks();
                break;
            case "record": checkRecord();
                break;
            case "addgrade": add();
                break;
            // }

            // if(input.equals("add")){
            //String newStudent =scanner.next();

            // public void newStudent()  
     /* System.out.println( "please enter new students name"  );
             String newStudent =scanner.next();
             System.out.println(newStudent);
             student=new Student(newStudent);
             addAGrade(newStudent);
             }*/
        }
    }

    public void addAGrade(String studentName) {
        Scanner scanner = new Scanner(System.in);
        //student=new Student(newStudent);
        System.out.println("please enter a grade");
        String grad = scanner.next();
        int grade = Integer.parseInt(grad);
        student.addGrade(grade);

    }

    public static void main(String[] args) {

        // input = new Student("Bob");
        //s2 = new Student("Joe");

        //  Random r = new Random();
        // for(int i = 0; i < 10; i++)
        //  {
        //  record.addGrade(r.nextInt(41) + 60);
        //s2.addGrade(r.nextInt(41) + 60);
        GradeBook gradebook = new GradeBook();
        for(;;){
                
               
        gradebook.controler();
        
        //gradebook.gradebooks();
       // gradebook.ui();
        //  System.out.println(s.getName() + ": " + s.getAverage());
        }   // System.out.println(s2.getName() + ": " + s2.getAverage());
    }
}
