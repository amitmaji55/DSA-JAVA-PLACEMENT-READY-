public class CLL {
    private Node head;
    private Node tail;
    private int val;

    CLL(){
        this.head = null;
        this.tail = null;
    }
    class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void insert(int data)
    {
        Node node = new Node(data);
        if(head==null)
        {
            head = node;
            tail= node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void display()
    {
        Node temp = head;
        if(head!=null)
        {
            do{
                System.out.print(temp.data+"->");
                temp = temp.next;
            }while(temp!=head);

        }
    }
    public void delete(int data) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.data == data) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.data == data) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }

    public static void main(String[] args) {
        CLL obj  = new CLL();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.delete(10);
        obj.display();
    }
}
