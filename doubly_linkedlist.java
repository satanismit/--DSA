public class doubly_linkedlist {
    class node
    {
        int data;
        node lptr,rptr;
        node(int data)
        {
            this.data=data;
            rptr=null;
            lptr=null;
        }
    }
    node L=null;
    node R=null;
  
     public void add_first(int data)
    {
        node temp =new node(data);
        if(L==null)
        {
            L=R=temp;
           return;
        }
       
        temp.rptr=L;
        L.lptr=temp;
        L=temp;
    }

    public void add_last(int data)
    {
        node temp = new node(data);
        if(R==null)
        {
            R=temp;
            return;
        }
        temp.lptr=R;
        R.rptr=temp;
    }

    public void remove_first()
    {
        if(L.lptr==null  && L.rptr==null)
        {
            L=null;
            return;
        }
        L=L.rptr;
        L.lptr=null;
    }

    public void remove_last()
    {
        if(L.lptr==null  && L.rptr==null)
        {
            L=null;
            return;
        }
        R=R.lptr;
        R.rptr=null;
    }
    
    public void for_display()
    {
        node cur=L;
        System.out.println("your linked list in left to right:");
        while(cur!=null)
        {
            System.out.println(cur.data+" ");
            cur=cur.rptr;
        }
    }

    public void back_display()
    {
        node cur=R;
        System.out.println("your linked list in right to left :");
        while(cur!=null)
        {
            System.out.println(cur.data+" ");
            cur=cur.lptr;
        }
    }

    public void remove_at(int x)
    {
        node cur=L;
        int count=0;
        if(cur.rptr==null)
        {
            cur=null;
            return;
        }
            while(cur!=null)
            {
                count++;
                cur=cur.rptr;
            }
            cur=L;
            for(int i=1; i<=count-1; i++)
            {
                 if(i==x-1)
                 {
                     cur.rptr=cur.rptr.rptr;
                    cur.rptr.lptr=cur;
                     return;
                 }
                 cur=cur.rptr;
            }



    }
    public void add_at(int data,int pos)
    {
        node cur=L;
        int count=0;
            if(pos==1)
            {
                add_first(data);
                return;
            }
            while(cur!=null)
            {
                count++;
                cur=cur.rptr;
            }
            if(pos==count+1)
            {
                add_last(data);
                return;
            }
            cur=L;
            node temp =new node(data);
           for(int i=1; i<=count-1; i++)
           {
                if(i==pos-1)
                {
                    cur.rptr.lptr=temp;
                    temp.rptr=cur.rptr;
                    temp.lptr=cur;
                    cur.rptr=temp;
                    return;
                }
                cur=cur.rptr;
           }
    }
    public static void main(String[] args) {
        doubly_linkedlist obj =new doubly_linkedlist();

        obj.add_first(10);
        obj.add_first(11);
        obj.add_first(12);
        // System.out.println("forward display :");
        // obj.for_display();
        // System.out.println("backward display :");
        // obj.back_display();
        // System.out.println("if remove first node :");
        // obj.remove_first();
        // obj.for_display();
        // System.out.println("if remove last node:");
        // obj.remove_last();
        // obj.for_display();
        // obj.back_display();
        obj.add_at(13,1 );
        //obj.for_display();
        obj.add_at(125, 3);
        obj.for_display();


    }
}
