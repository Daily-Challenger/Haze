class MyStack {
    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        // 1. 새 값을 queue에 추가
        queue.add(x);
        
        // 2. 새 값이 맨 앞이 되도록
        //    기존 값들을 다시 추가
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.remove());
        }
    }
    
    public int pop() {
        // queue의 첫 번째가 Stack의 맨 위
        return queue.remove();
    }
    
    public int top() {
        // queue의 첫 번째가 Stack의 맨 위
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}
