  public static ListNode segregateEvenOdd(ListNode head)
    {
       if(head==null||head.next==null)
       {
           return head;
       }

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
