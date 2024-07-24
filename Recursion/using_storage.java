//using temporary storage of an array type long  to compute fibonacci number

public class using_storage {
    public static void main(String[] args) {
        for(int n=30; n<=40; n++)
        {
            long t0=System.currentTimeMillis();
            long m=fibonacci.number(n);
            long t1=System.currentTimeMillis();
            System.out.println("f("+n+") =" +m+"\t time:"+(t1-t0));
        }
    }
}
class fibonacci{
    private static long[] fib =new long[100];
    private static int lastind=2;

    static{             //class initializer 
        fib[1]=fib[2]=1;
    }
    
    public static long number(int n)
    {
    for(int i=lastind+1; i<=n; i++)
    {
        fib[i]=fib[i-1]+fib[i-2];

    }
    if(n>lastind)  lastind=n;
    return fib[n];
    }
}




