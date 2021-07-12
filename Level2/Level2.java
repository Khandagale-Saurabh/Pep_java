  public static ListNode segregateEvenOdd(ListNode head)
    {
       if(head==null||head.next==null)
       {
           return head;
       }
//ds
       ListNode DummyEven=new ListNode(-1);
       ListNode DummyOdd=new ListNode(-1);
       ListNode evenTail=DummyEven,oddTail=DummyOdd;

       ListNode currNode=head;
       while(currNode!=null)
       {
         if(currNode.val%2==0)
         {
             evenTail.next=currNode;
             evenTail=evenTail.next;
         }
         else
         {
             oddTail.next=currNode;
             oddTail=oddTail.next;

         }
         currNode=currNode.next;
       }
       evenTail.next=DummyOdd.next;
       oddTail.next=null;///Most Important
       return DummyEven.next;
    }



public static ListNode removeDuplicates(ListNode head) 
    {
        if(head==null||head.next==null) return head;
        ListNode curr=head.next; //imp
        ListNode Dummy=new ListNode(-1);
        ListNode iter=Dummy;
        iter.next=head;
        while(curr!=null)
        {
            boolean isLooprun=false;
            while(curr!=null && iter.next.val==curr.val)
            {
                isLooprun=true;
                curr=curr.next;
            }
            if(isLooprun)
            {
                iter.next=curr;
            }
            else
            {
             iter=iter.next;   
            }
            if(curr!=null)curr=curr.next;///Imp step 1->1->1->N(iteratior point to null) to avoid this we use this
        }
            return Dummy.next;
    }



  public static ListNode subtractTwoNumbers(ListNode l1, ListNode l2)
    {
    
        if(l2==null)
        {
            return l1;
        }
        if(l1==null)
        {
         l2.val=-l2.val;
         return l2;
        }
        
        
        /*
        int diff=0;
        int bow=0;
               -1
          1->2->3->4->5
        - 
          9->2
        ==========
          0/  2
        */
        ListNode Dummy =new ListNode(-1);
        ListNode itr=Dummy;
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode c1=l1;
        ListNode c2=l2;
        int borr=0;
        while(c1!=null)
        {
            int diff=borr+c1.val-(c2!=null?c2.val:0);//imp
            if(diff<0)
            {
               diff+=10;//imp
               borr=-1;
            }
            else
            {
                borr=0;
            }
            ListNode newNode=new ListNode(diff);
            itr.next=newNode;
            itr=itr.next;
            c1=c1.next;
            if(c2!=null) c2=c2.next;//imp
        }
        return reverse(Dummy.next); 
        
    }
