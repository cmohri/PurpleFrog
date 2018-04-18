public interface Deque<T>{

    public DLLNode<T> peekFirst();
    public DLLNode<T> peekLast();
    
    public void addFirst(T x);
    public void addLast(T x);
    
    public T removeFirst();
    public T removeLast();

    public int size();

}
    
