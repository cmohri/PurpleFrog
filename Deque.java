public interface Deque<T>{

    //returns value of first or last, without removing from the queue
    public DLLNode<T> peekFirst();
    public DLLNode<T> peekLast();
    
    //adds to the front or the end
    public void addFirst(T x);
    public void addLast(T x);
    
    //removes from front or end
    public T removeFirst();
    public T removeLast();

    //returns size of the queue
    public int size();

}
    
