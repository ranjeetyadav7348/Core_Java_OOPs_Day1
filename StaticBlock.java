public class StaticBlock {

    static int x;
    int y=19;


    static{

        System.out.println("this is first static block "+x);
        x=12;
        System.out.println("this isfirst static block but with intialized value of "+x);

    }


    public static void main(String[] args) {

        System.out.println("this is main block ");
        
    }

    static{
        System.out.println("this is second static block "+x);
        
        int y=4;
        StaticBlock s1 =new StaticBlock();
        s1.y=42;
        System.out.println("this is second static block with global value "+s1.y);
        System.out.println("this is second static block with local value "+y);

    }
    
}
