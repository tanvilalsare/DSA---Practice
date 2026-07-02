import java.util.Stack;

class MinStack {
    // dataStack stores all the elements normally
    private Stack<Integer> dataStack;
    // minStack stores the minimum value matching each state of dataStack
    private Stack<Integer> minStack;

    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int value) {
        dataStack.push(value);
        
        // If minStack is empty, this new value is the absolute minimum so far.
        // Otherwise, see if this new value is smaller than our current minimum.
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        } else {
            minStack.push(minStack.peek());
        }
    }
    
    public void pop() {
        // Pop from both stacks to keep them perfectly synchronized
        dataStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return dataStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */