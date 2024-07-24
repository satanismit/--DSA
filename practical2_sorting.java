public class practical2_sorting{

    public static int bubble(int[] arr,int n)
    {
        int swap=0,com=0;
        int flag=0,swp=0;
        for(int i=0;i<n-1;i++)
        {
            for (int j=0; j<n-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                    flag=-1;
                    swp++;
                }
            }
            com++;
            if(flag==0)
            {
              break;
            }
        }
        System.out.println(com);
        return swp;
    }
   
    public static void selection(int[] arr, int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min_ind=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[min_ind]>arr[j])
                {
                    min_ind=j;
                }
            }
            int temp=arr[min_ind];
            arr[min_ind]=arr[i];
            arr[i]=temp;
        }
    }
    
    public static void insertion(int[] arr ,int n)
    {
        for(int i=1;i<n; i++)
        {
            int key=arr[i];
            int j=i-1;
            while(arr[j]>key && j>=0)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }
    }
    public static void main(String[] ars)
    {
        int[] arr = {1,2,3,5,4};
        int size= arr.length;
         int swp=bubble(arr,size);
         // selection(arr, size);
         for(int i:arr)
         {
            System.out.println(i);
         }
         System.out.println(swp);
        // System.out.println(com);

    }
}