public class DLL {
    private  Node head;
    private Node tail;
   private int size;
    DLL()
    {
        this.size = 0;
    }
    public class Node{

        int data;
        Node prev;
        Node next;
        Node(int data)
        {
            this.next = null;
            this.data = data;
            this.prev = null;
        }
    }
    public void add_first(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if(head!=null)
        {
            head.prev=newNode;
        }
        head = newNode;
    }

    public void add_last(int data)
    {
       Node newNode = new Node(data);
       if(head == null)
       {
           newNode.prev = null;
           head = newNode;
       }
       Node last = head;
       while(last.next!=null)
       {
           last = last.next;

       }
       last.next = newNode;
       newNode.prev = last;
    }

    public  Node find(int data)
    {
        Node node = head;
        while(node!=null)
        {
            if(node.data == data)
            {
                return node;
            }
        node = node.next;
        }
        return null;
    }

    public void insert_any_pos(int after, int data)
    {
        Node p = find(after);
        if (p == null) {
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(data);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }
    public void delete_first()
    {
        if(head==null)
        {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        Node temp = head;
        temp = temp.next;
        head = temp;
        head.prev = null;
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println(" Empty !! ");
        }
        Node temp = head;
        Node last = null;
        while(temp!=null)
        {
            System.out.print(temp.data + " =>");
            last = temp;
            temp = temp.next;
        }
        System.out.println("NULL");

        while(last!=null)
        {
            System.out.print(last.data + " =>");
            last = last.prev;
        }
        System.out.println("HEAD");

    }

    public static void main(String[] args) {
        DLL obj = new DLL();
        obj.add_first(10);
        obj.add_first(20);
        obj.add_first(30);
        obj.add_first(40);
        obj.delete_first();
        obj.display();
    }

}
