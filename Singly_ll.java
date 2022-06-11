class LL{
    Node head;
    private int size = 0;
    LL()
    {
        this.size = 0;
    }
   public class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }
     /*
     ADD DATA TO THE FIRST OF THE LINKED LIST
     */

    public void insert_first(int data)
    {
        Node new_node = new Node(data);
        if(head==null)
        {
            head = new_node;
            return;
        }
        new_node.next = head;
        head = new_node;
    }
    /*
     ADD DATA TO THE LAST OF THE LINKED LIST
     */
    public void insert_last(int data)
    {
        Node new_node = new Node(data);
        if(head==null)
        {
            head = new_node;
            return;
        }
        Node curr_node = head;
        while(curr_node.next!=null)
        {
            curr_node = curr_node.next;
        }
        curr_node.next = new_node;

    }
    public void insert_any_pos (int index, int data) {
        if(index > size || index < 0) {
            System.out.println("Invalid Index value");
            return;
        }
        size++;

        Node newNode = new Node(data);
        if(head == null || index == 0) {
            insert_first(data);
        }
        if(index==size)
        {
            insert_last(data);
        }
        Node currNode = head;
        for(int i=1; i<size; i++) {
            if(i == index) {
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }
    }
    public void delete_first()
    {
        if(head==null)
        {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        head = head.next;
        size--;
    }

    public void  delete_last()
    {
        if(head==null)
        {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        size--;
        if(head.next==null)
        {
            head = null;
        }

        Node first = head;
        Node second = head.next;
        while(second.next!=null)
        {
            second = second.next;
            first = first.next;
        }
        first.next = null;
    }

    public void printList() {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

        public static void main(String[] args) {
        LL obj = new LL();
        obj.insert_first(1);
        obj.insert_first(5);
        obj.insert_first(7);
        obj.insert_first(3);
        obj.insert_first(8);
        obj.insert_first(2);
        obj.insert_first(3);
        obj.insert_last(100);
        obj.insert_first(1000);
        obj.delete_last();
        obj.delete_first();
        obj.printList();
    }
}


