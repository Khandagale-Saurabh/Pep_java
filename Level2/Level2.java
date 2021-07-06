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
