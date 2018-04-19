public interface Deque<T>{

    //returns value of first or last, without removing from the queue
    //returns null if there is nothing
    public String peekFirst();
    public String peekLast();
    
    //adds to the front or the end
    public void addFirst(T x);
    public void addLast(T x);
    
    //removes from front or end
    public String removeFirst();
    public String removeLast();

    //returns size of the queue
    public int size();

    //returns whether the queue is empty
    public boolean isEmpty();

}
    
