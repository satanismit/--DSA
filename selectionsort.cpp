#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void increasing(int arr[],int n)
{
    int min_ind;
    for(int i=0; i<n-1; i++)
    {
        int min_ind=i;
        for(int j=i+1; j<n; j++)
        {
            if(arr[min_ind]>arr[j])
            {
                min_ind=j;
            }
        }
           int temp =arr[min_ind];
           arr[min_ind]=arr[i];
           arr[i]=temp;
    }

}
 
void decreasing(int arr[],int n)
 {
    int max_ind;
    for(int i=0; i<n-1; i++)
    {
        int max_ind=i;
        for(int j=i+1; j<n; j++)
        {
            if(arr[max_ind]<arr[j])
            {
                max_ind=j;
            }
        }
           int temp =arr[max_ind];
           arr[max_ind]=arr[i];
           arr[i]=temp;
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
    cout<<"sorted array in increasing order :";
    increasing(n1,n);
    print(n1,n);
    cout<<endl<<"sorted array in decreasing order :";
    decreasing(n1,n);
    print(n1,n);

    return 0;
}