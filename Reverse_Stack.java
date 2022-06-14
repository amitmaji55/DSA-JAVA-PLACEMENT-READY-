import java.util.ArrayList;
import java.util.Stack;

public class Push_bottom_of_stack{
    public static void push_at_bottom(Stack<Integer> s, int data)
    {
       if(s.isEmpty())
       {
           s.push(data);
           return;
       }
       int temp = s.pop();
       push_at_bottom(s,data);
       s.push(temp);
    }
    public static void  reverse_stack(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top = s.pop();
        reverse_stack(s);
       push_at_bottom(s,top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }

    }
}
