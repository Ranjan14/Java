/*Write a JAVA program to implement class mechanism. – Create a class Student to read studentname, usn,dept, marks1,marks2,marks3,marks4,marks 5,marks 6 
implement method to read the information and calculate the average marks*/



import java.util.Scanner;
/*class Stu{
    
}
*/

public class student{
    String name;
    String usn;
    String dept;
    int marks1,marks2,marks3,marks4,marks5,marks6;
       
    void read(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the student name : ");
        name = input.nextLine();
        System.out.print("Enter the student USN : ");
        usn = input.nextLine();
        System.out.print("Enter the student Department : ");
        dept = input.nextLine();
        System.out.println("Enter the marks of 6 subject: ");
        marks1 = input.nextInt();
        marks2 = input.nextInt();
        marks3 = input.nextInt();
        marks4 = input.nextInt();
        marks5 = input.nextInt();
        marks6 = input.nextInt();
    }

    public float average(){
        int total = marks1 + marks2 + marks3 + marks4 + marks5 + marks6;
        float avg = total/(float)6;
        return avg;
    }
        
    public void show(){
        float avg1=average();
        System.out.println("Name of the student : "+name);
        System.out.println("USN of "+name+" : "+usn);
        System.out.println("Department of "+name+" : "+dept);
        System.out.println("Average marks of "+name+" : "+avg1);
    }  
    
    public static void main(String[] args){
        
        student ob = new student(); //creating an object
        ob.read();
        ob.average();  
        ob.show();
        //show(name, usn, dept, avg);
        //System.out.println("Name of the student : "+name);
        //System.out.println("USN of "+name+" : "+usn);
        //System.out.println("Department of "+name+" : "+dept);
        //System.out.println("Average marks of "+name+" : "+avg1);
    }
}
