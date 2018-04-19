public class QQKachoo<T> implements Deque<T>{

    private DLLNode<T> _front;
    private DLLNode<T> _end;
    private int _size;

    public QQKachoo(){
	_front = null;
	_end = null;
    }

    public T peekFirst(){
	return _front.getValue();
    }

    public T peekLast(){
	return _end.getValue();
    }

    public T removeFirst(){
	T retVal = peekFirst();
	_front = _front.getNext();
	return retVal;
	_size -=1 ;
    }

    public T removeLast(){
	T retVal = peekLast();
	_last = _last.getLast();
	_size -= 1;
	return retVal;
    }

    public int size(){
	return _size;
    }

    public boolean isEmpty(){
	return _size <= 0;
    }

    public void addFirst(T x){
	DLLNode<T> node = new DLLNode<T>(x, null, _front);
	_front = node;
    }
    
    public void addLast(T x){
	DLLNode<T> node = new DLLNode<T>(x, _end, null);
	_end = node;
    }
}