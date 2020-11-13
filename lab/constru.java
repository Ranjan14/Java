public class constru {
    String name;
    String usn;
    int age;
    
    constru(){          //default
        name = "Ranjan M B";
        usn = "01JST18IS036";
        age = 19;
        //this.name = "Ranjan M B";
        //this.usn = "01JST18IS036";
        //this.age = 19;
    }

    constru(String NAME, String USN, int AGE){   //parameterised
        name=NAME;
        usn=USN;
        age=AGE;
        
        //this.name=name;
        //this.usn=usn;
        //this.age=age;
    }

    constru(String NAME){
        name=NAME;
    }

    void show(){
        System.out.println("#####################");
        System.out.println("Name :"+name);
        System.out.println("usn :"+usn);
        System.out.println("age :"+age);

    }

    public static void main(String[] args) {
        constru ob1 = new constru();
        ob1.show();
        constru ob2 = new constru("karthik","01JST18IS019",20);
        ob2.show();
        constru ob3 = new constru("Chandrakanth");
        ob3.show();
    }
}
