import java.util.Queue;
import java.util.LinkedList;

class TwoQueueStack{

    Queue<Integer> in = new LinkedList<>();
    Queue<Integer> backup = new LinkedList<>();

    int last = 0;
    boolean hasOne = false;
   
    // Push element x onto stack.
    // O(1)
    public void push(int x) {
        if (hasOne){
            in.offer(last);
        }
        last = x;
        hasOne = true;
    }

    // Removes the element on top of the stack.
    // O(n)
    public void pop() {
        if (in.isEmpty()){
            hasOne = false;
        }else{
            int count = 0;
            while(count < in.size() - 1){
                backup.offer(in.remove());
                count++;
            }
            last = in.remove();
            Queue<Integer> tmp = backup;
            backup = in;
            in = tmp;
        }
    }

    // Get the top element.
    // O(1)
    public int top() {
        return last;
    }

    // Return whether the stack is empty.
    // O(1)
    public boolean empty() {
        return !hasOne;
    }
}
