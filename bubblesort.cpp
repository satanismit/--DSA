#include<iostream>
using namespace std;
 
 void increase(int arr[], int n)
 {
    for(int i=0; i<n-1; i++)
    {
        for(int j=0; j<n-1-i; j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
 }
 
 void decrease(int arr[], int n)
 {
    for(int i=0; i<n-1; i++)
    {
        for(int j=0; j<n-1-i; j++)
        {
            if(arr[j]<arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
 }

 void print(int n1[],int n)
 {
      for(int i=0; i<n; i++)
      {
         cout<<endl<<n1[i];
      }
 }

int main()
{
    int n;
    cout<<"enter one aray size:";
    cin>>n;
    int n1[n];
    for(int i=0; i<n; i++)
    {
       cin>>n1[i];
    }
    increase(n1,n);
    
    cout<<endl<<"sorted array in increasing order :";
    print(n1,n);

    decrease(n1,n);
    
    cout<<endl<<"sorted array in decreasing  order :";
    print(n1,n);

return 0;
}