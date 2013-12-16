package gradebook;

import java.util.ArrayList;

public class Student {
    public String name;
    protected ArrayList<Integer> grades = new ArrayList<Integer>();
    
     Student(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void addGrade(int grade){
        grades.add(grade);
    }
    public void getGrades(){
        for(int s : grades){
           System.out.print(" "+ s+" ");
            
        } }
    
    public int getAverage() {
        int total = 0;
        for(int grade : grades) {
            //total = total + grade;
            total += grade;
        }
        //total = total / grades.size();
        total /= grades.size();
        return total;
    }
}
