class Queue_Using_Array{
     static class Queues{
         static int[]  arr;
         static int size ;
         static int rear;
         Queues(int size)
         {
             arr = new int[size];
             this.size = size;
             rear = -1;
         }

         public static boolean is_empty()
         {
             return rear==-1;
         }
         public static boolean is_full()
         {
             return rear==size-1;
         }
         public static void  Enqueue_operation(int data)
         {
             if(is_full())
             {
                 System.out.println(" Queue is already full !! ");
                 return;
             }
              rear++;
             arr[rear] = data;
         }
         public static int Dequeue_operation()
         {
             if(is_empty())
             {
                 System.out.println(" Queue Is already empty !! ");
                 return -1;
             }
          int front = arr[0];
             for (int i=0;i<rear;i++)
             {
                 arr[i] = arr[i+1];
             }
             rear--;
             return front;
         }
         public static int peek_operation()
         {
             if(is_empty())
             {
                 System.out.println(" Queue Is already empty !! ");
                 return -1;
             }
             return arr[0];
         }
     }
    public static void main(String[] args) {
        Queues ob = new Queues(4);
        ob.Enqueue_operation(10);
        ob.Enqueue_operation(20);
        ob.Enqueue_operation(30);
        ob.Enqueue_operation(40);
        while(!ob.is_empty())
        {
            System.out.println(ob.peek_operation());
            ob.Dequeue_operation();
        }
    }

}

