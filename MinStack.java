import java.util.Stack;

class MinStack
{
    public Stack<Integer> s=new Stack<>();
    public int min;

    public void push(int x)
    {
        if (s.empty()) {
            s.push(x);
            min=x;
        }
        else if (x>min) {
            s.push(x);
        }
        else {
            s.push(2*x-min);
            min=x;
        }
    }
    public void pop()
    {
        if (s.empty()) {
            System.out.println("Stack underflow");
        }

        int top=s.peek();
        if (top<min)
            min = 2*min-top;
        s.pop();
    }

    public int min()
    {
        return min;
    }

    public static void main (String[] args)
    {
        MinStack s=new MinStack();
        s.push(6);
        s.push(7);        
        s.push(5);
        s.push(3);
        s.pop();
        System.out.println(s.min());
    }
}