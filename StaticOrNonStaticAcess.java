/**
 * StaticOrNonStaticAcess
 */
public class StaticOrNonStaticAcess {

   public int x=4;


   //Rule
//    Non-Static can acess non-static 
//    Non-Static can acess static 
//    static can't acess non-static
//    static can acess only static 

    public static void fun1()
    {
        StaticOrNonStaticAcess s1= new StaticOrNonStaticAcess();


        System.out.println("this is first static block "+s1.x);
    }

    public void fun2()
    {
        System.out.println("this is non-static block "+x);
    }


    public static void main(String[] args) {

        fun1();
        StaticOrNonStaticAcess s1= new StaticOrNonStaticAcess();
        s1.fun2();

        
    }

    
}