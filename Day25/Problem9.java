package Day25;
import java.util.Stack;

public class Problem9 {

    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    // Constructor
    public Problem9() {
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        peek();
        return out.pop();
    }

    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}