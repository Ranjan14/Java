//Illustrate through the program method overloading that calculates area of Triangle, Rectangle, Square and Circle


public class MethOver {
    //Scanner in = new Scanner(System.in);
    public void MO(double a, double b, double c)   //area of triangle    3 argu
    { 
        double s=(a+b+c)/2;
        double e=(s*(s-a)*(s-b)*(s-c));
        double f=Math.sqrt(e);
        System.out.println("Area of triangle is "+f);
    }       
    public void MO(float g, float h)  //area of rectangle       2 argu
    {
        float i=g*h;   // length * breadth
        System.out.println("Area of rectangle is "+i);
    }
    public void MO(double j)                  
    {
        double k=Math.pow(j,2);   // j to the power 2
        System.out.println("Area of square is "+k);
    }
    public void MO(int l)  //area of circle      radius          1 argu
    {
        double m=(3.14*l*l);   // pi* r square
        System.out.println("Area of circle is "+m);
    }

    public static void main(String[] args){
        MethOver obj = new MethOver();
        obj.MO(1.5,2.5,3.3);
        obj.MO(1,2);
        obj.MO(2.5);
        obj.MO(1);
    }
}

//error: incompatible types: possible lossy conversion from double to float