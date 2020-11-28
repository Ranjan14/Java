//Demonstrate through a program method overriding using super keyword that computes area of Triangle, Rectangle, Square and Circle.
import java.lang.Math;

class override1{
    void override(){
    //area of triangle 
    double a=1.5;
    double b=2.5;
    double c=3.3;
    double s=(a+b+c)/2;
    double e=(s*(s-a)*(s-b)*(s-c));    
    double f=Math.sqrt(e);

    //area of rectangle 
    float g=1, h=2;
    float i=g*h;   // length * breadth
          
    //area of square 
    double j=2.5;   
    double k=Math.pow(j,2);   // j to the power 2   

    //area of circle
    int l=5;
    double m=(3.14*l*l);   // pi* r square

    System.out.println("Area of triangle is "+f);
        System.out.println("Area of rectangle is "+i);
        System.out.println("Area of square is "+k);
        System.out.println("Area of circle is "+m);
    }
} 
class override2 extends override1{
    void override(){
    //super(); 
    //System.out.println("Area of triangle is "+f);
    //System.out.println("Area of rectangle is "+i);
    //System.out.println("Area of square is "+k);
    //System.out.println("Area of circle is "+m);
    System.out.println("Overriding");
    }
    void print(){
        super.override();
        
        override();
    }
}

public class MethOverride {
    public static void main(String[] args){
        override2 ob = new override2();
        ob.print();
    }
}
