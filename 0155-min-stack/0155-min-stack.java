class MinStack {

    static class Node{
        int data;
        int min;
        Node next;

        Node(int data,int min){
            this.data = data;
            this.min = min;
        }
    }

    Node top = null;

    public MinStack() {
        
    }
    
    public void push(int value) {
        int min = (top == null) ? value : Math.min(value, top.min);
        Node newNode = new Node(value,min);
        newNode.next = top;
        top = newNode;
    }
    
    public void pop() {
        if(top != null){
            top = top.next;
        }
    }
    
    public int top() {
        return top.data;
    }
    
    public int getMin() {
        return top.min;
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