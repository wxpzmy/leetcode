import java.util.Stack;

// Amortized cost is O(1) for each operation
class TwoStackQueue {
    
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();
    
    // Push element x to the back of queue.
    public void push(int x) {
        in.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (out.isEmpty()){
            movequeue();
        }
        out.pop();
    }

    // Get the front element.
    public int peek() {
        if (out.isEmpty()){
            movequeue();
        }
        return out.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
    
    private void movequeue(){
        while (!in.isEmpty()){
            out.push(in.pop());
        }
    }
}
