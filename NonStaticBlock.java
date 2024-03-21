public class NonStaticBlock {

    int x;


    

// non-static executed after object created
    static int y;

    {
        System.out.println("this is non-static block "+x);
        x=10;
        System.out.println("this is non-static block with intilized value"+x);
        y=16;
        System.out.println("this is non-static block with non-static value"+y);
        
    }


    // it executed while  static loading

    static
    {

        // NonStaticBlock n1= new NonStaticBlock();
        int x=12;
        // System.out.println("this is static block "+n1.x);
        System.out.println("this is static block "+x);
      
    }
    



    public static void main(String[] args) {
        System.out.println("this is our main block ");
          NonStaticBlock n1= new NonStaticBlock();
        
    }

    
    
}
