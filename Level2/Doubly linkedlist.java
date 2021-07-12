
    public int removeLast()
    {
        //0,1,5...nth
        int val=0;
      if(size==0)
      {
          ListIsEmptyException();
          return -1;
      }
      else if(size==1)
      {
          val=tail.data;
          head=tail=null;  
      }
      else
      {
        //   val=tail.data;
        //   Node save=tail;
        //   tail= tail.prev;
        //   tail.next=null;
        //   save.prev=null;
        // //   tail.next=tail.prev=null;
        val=tail.data;
        Node save=tail;
        tail=tail.prev;
        tail.next=null;
        // save.prev=null;
      }
      size--;
      return val;
    }

  }
