import java.util.Stack;

public class Solution {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public void push(int node) {
        stack.push(node);
        if (minStack.isEmpty() || minStack.peek() > node) {
            minStack.push(node);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        if(!stack.isEmpty() && !minStack.isEmpty()) {
            stack.pop();
            minStack.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.peek();
    }

    public int min() {
        if(minStack.isEmpty()) {
            return -1;
        }
        return minStack.peek();
    }
}
