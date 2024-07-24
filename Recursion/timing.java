public class timing {

    static     //class initializer
    {
        System.out.println("hello");
    }
    
    public static void main(String[] args) {
        for(int n=30; n<=40; n++)
        {
            long t0=System.currentTimeMillis();
            long m=f(n);
            long t1=System.currentTimeMillis();
            System.out.println("f("+n+") =" +m+"\t time:"+(t1-t0));
        }
    }

    //Recursive fibonacci function 

    static long f(int n)
    {
        if(n<1) return 0;
        if(n<3) return 1;
        return f(n-1)+f(n-2);
    }

    //Iterative fibonacci function 

    // static long f(int n)
    // {
    //     if(n<2) return n;
    //     long f0=0,f1=1,f2=1;
    //     for(int i=2;i<n; i++)
    //     {
    //         f0=f1;
    //         f1=f2;
    //         f2=f0+f1;
    //     }
    //     return f2;

    // }
}
