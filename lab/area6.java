//Write a java program to create an abstract class named shape that contains two integers and an empty method named print Area(). 
//Provide three classes named Rectangle, Triangle and Circle such that each one of the classes extends the class shape. 
//Each one of the class contains only the method print Area() that print the area of the given shape

import java.util.*;
import java.lang.*;
class A{
  void area(double l,double b){
    double a = (double)1/2 * l * b;
     System.out.println("Area of triangle is "+a+" sq.cms");}
  void area1(double s){
   double a = Math.pow(s,2);
   System.out.println("Area of square is "+a+" sq.cms"); }
}
class area6 extends A{
  void area(double l,double b){
     double a = l * b;
     System.out.println("Area of rectangle is "+a+" sq.cms");
     super.area(l,b);
}
  void area1(double r){
     double a = Math.PI * r * r;
     System.out.println("Area pf circle is "+a+" sq.cms");
     super.area1(r);
  }
  public static void main(String[] args){
   double a,b;
   double r;
   area6 obj = new area6();
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter lenghts and breadths for triangle and rectangle in cms");
   a = sc.nextDouble();
   b = sc.nextDouble(); 
   System.out.println("Enter radius or sides for circle/square in cms");
   r = sc.nextDouble();
   obj.area(a,b); //for rectangle 
   obj.area1(r); // for circle
  //System.out.println("Area of rectangle(in sq.cms): "+x+"\nArea of triangle(in sq.cms): "+y);
 //System.out.println("Area of square(in sq.cms): "+v+"\nArea of circle(in sq.cms): "+u);
  }
}