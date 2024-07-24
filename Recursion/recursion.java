import java.util.Scanner;
public  class recursion {

    static int  fibonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if( n==2 || n==1)
        {
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);    //return methods
        }
    }
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

    System.out.println("entre number:");
    int x =sc.nextInt();

    for(int i=0;i<x;i++)
    {
        int y=fibonacci(i);
        System.out.println(y);
    }
   
    //System.out.println(y);
    sc.close();
        
    }
}
