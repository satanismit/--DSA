import java.util.Scanner;
public class recursion2 {
    static int foo(int n)
    {
        if(n==0)  return 0;
        if(n==1 || n==2)   return 1;

        int k= foo(n-1)+foo(n-2);
        System.out.println("world..");
        return k;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();  

    int d=foo(n);
    System.out.println(d);
   
    }
}
