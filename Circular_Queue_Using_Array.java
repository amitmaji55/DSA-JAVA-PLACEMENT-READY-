class Circular_Queue_Using_Array{
   static class Queues{
        static int[] arr;
        static int size;
        static int rear = -1;
        static int front = -1;
        Queues(int size)
        {
            arr = new int[size];
            this.size = size;
        }
        public static boolean is_empty()
        {
            return rear == -1 && front ==-1;
        }
        public static boolean is_full()
        {
            return (rear+1)%size ==front ;
        }
        public static void add(int data)
        {
            if(is_full())
            {
                System.out.println("Queue is full ");
                return;
            }
            if(front==-1)
            {
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        public static int remove()
        {
            if(is_empty())
            {
                System.out.println("Queue is underflow");
                return -1 ;
            }
            int result = arr[front];
            if(rear==front)
            {
                rear = front = -1;
            }
            else {
                front = (front+1) %size;
            }
            return result;
        }
        public static int peek(){
            if(is_empty())
            {
                System.out.println("Queue is underflow");
                return -1 ;
            }
            int res = arr[front];
            return res;
        }
    }
    public static void main(String args[]) {
        Queues q = new Queues(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.is_empty()) {
            System.out.println(q.remove());
        }
    }
}
