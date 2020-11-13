/*Implement a constructor which accepts object as parameter.*/

public class ConPara {
    String name;
    String usn;
    int age;
    
    ConPara(){          //default
        name = "Ranjan M B";
        usn = "01JST18IS036";
        age = 19;
    }
    ConPara(String NAME, String USN, int AGE){   //parameterised
        name=NAME;
        usn=USN;
        age=AGE;
    }
    ConPara(ConPara obj){
        name=obj.name;
        usn=obj.usn;
        age=obj.age;
    }
    void show(){
        System.out.println("#####################");
        System.out.println("Name :"+name);
        System.out.println("usn :"+usn);
        System.out.println("age :"+age);
    }
    public static void main(String[] args){
        ConPara ob1 = new ConPara();
        ob1.show();
        ConPara ob2 = new ConPara("karthik","01JST18IS019",20);
        ob2.show();
        ConPara ob3 = new ConPara(ob2);
        ob3.show();
    }
}
