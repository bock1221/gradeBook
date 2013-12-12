package gradebook;

import java.util.ArrayList;

public class Student {
    public String name;
    private ArrayList<Integer> grades = new ArrayList<Integer>();
    
    public Student(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void addGrade(int grade){
        grades.add(grade);
    }
    
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
