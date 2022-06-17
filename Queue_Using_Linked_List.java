public class Queue_Using_LinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
             next = null;
        }
    }

    static class Queues {

        static Node head = null;
        static Node tail = null;

        public static boolean is_empty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (is_empty()) {
                tail = head = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public static int remove() {

            if (is_empty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        public static int peek() {
            if (is_empty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[]) {
        Queues q = new Queues();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.is_empty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
