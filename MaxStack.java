import java.util.Stack;

class MaxStack
{
    public Stack<Integer> s=new Stack<>();
    public int max;

    public void push(int x)
    {
        if (s.empty()) {
            s.push(x);
            max=x;
        }
        else if (x<max) {
            s.push(x);
        }
        else {
            s.push(2*x-max);
            max=x;
        }
    }
    public void pop()
    {
        if (s.empty()) {
            System.out.println("Stack underflow");
        }

        int top=s.peek();
        if (top>max)
            max = 2*max-top;
        s.pop();
    }

    public int max()
    {
        return max;
    }

    public static void main (String[] args)
    {
        MaxStack s=new MaxStack();
        s.push(6);
        s.push(7);        
        s.push(5);
        s.push(8);
        s.pop();
        System.out.println(s.max());
    }
}