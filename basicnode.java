import java.util.Scanner;

public class basicnode {
    
    class node{               // to create  node of linked list for editing
        int info;
        node link;  
         node(int info)      
        {
            this.link=null;
            this.info=info;
         System.out.println("one node created...yehh");
        }
    }
         node head=null;      //globaly declare 
    public void addfirst(int info)
    {
        node temp =new node(info);      //create temporary pointer
        // every time create a new temp poniter to point a new node 

        if(head==temp)
        {                          //if there is first node
            head=temp;
            return;
        }
        else   
        {
            temp.link=head;
            head=temp;     
        }

    }

    public void addlast(int info) 
    {
        node temp = new node(info);

        if(head==temp)
        {                          //if there is first node
            head=temp;
            return;
        }
        node trav=head;
  
        while(trav.link!= null)
        {
            trav=trav.link;
        }
        trav.link=temp;
    }

    public void addmid(int info,int x)
    {
        node n1 =new node(info);
        node trav = head;
        if(trav.info == x)
        {
            addfirst(info);
        }
        else
        {
        while(trav.link.info!=x)
          {
            trav=trav.link;
          }
        n1.link=trav.link;
        trav.link=n1;
        }    
    }
    
    public void display()
    {
        node trav=head;
        System.out.print("after that your linked list ---------> ");
        while(trav.link!= null)
        {
            System.out.print(trav.info+" ");
            trav=trav.link;
        } 
        System.out.println(trav.info);
    }

    public void deletefirst()
    {
        if(head==null)
        {
            return ;
        }
        node temp =head;
        head=temp.link;
        System.out.println("ohhhh.....first node destroyed");
    }

    public node deletelast()
    {
       node temp=head;
      
       if(temp.link==null)
       {
        temp.info=0;
        System.out.println("ohh...... you deleted your linked list");
        return null;
       }
      
       while(temp.link.link!=null)
       {
        temp=temp.link;
       }
       temp.link=null;
       System.out.println("ohh...... you deleted last node");
       return head;
    }
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        basicnode obj =new basicnode();

        System.out.println("how many node you want to create:");
        int n=sc.nextInt();
       
        for(int i=0;i<n; i++)
        {
            System.out.println("enter elemets "+(i+1));
            int s=sc.nextInt();
            obj.addfirst(s);
        }
       // obj.addmid(50,10);  //add a node before x value
        obj.display();
        // obj.deletefirst();
        // obj.display();
        // obj.deletelast();
        // obj.display();
        // obj.deletefirst();
        // obj.display();
        // obj.deletelast();
        // obj.display();
    }
}
