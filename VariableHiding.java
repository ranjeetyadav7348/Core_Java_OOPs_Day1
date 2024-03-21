public class VariableHiding {
    static int x=10;
    int y=13;


    //static variable hiding

    static void fun1()
    {
        int x=11;
        System.out.println("this is the first static block for local "+x);
        System.out.println("this is the first static block for global "+VariableHiding.x);

        //this keyword can't use in static method
        VariableHiding v1= new VariableHiding();
        System.out.println("this is static method with non-static variable "+ v1.y);

    }


    void fun2()
    {

        int y=8;
        System.out.println("this is non-static block for local "+y);

        //this keyword is current object reference
        System.out.println("this is non-static block for global "+this.y);

    }


    public static void main(String[] args) {

        fun1();

        VariableHiding v1=new VariableHiding();
       v1.fun2();
        
    }
    
}
