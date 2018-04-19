public class QQKachoo<T> implements Deque<T>{

    private DLLNode<T> _front;
    private DLLNode<T> _end;
    private int _size;

    public QQKachoo(){
	_front = null;
	_end = null;
	_size =0 ;
    }

    public String peekFirst(){
	if (isEmpty()){ return null; }
	return _front.getCargo();
    }

    public String peekLast(){

	String retVal  = _end.getCargo();
	return retVal;
    }

    public String removeFirst(){
	String retVal = peekFirst();
	_front = _front.getNext();
	_size -=1 ;
	return retVal;
    }

    public String removeLast(){
	String retVal = peekLast();
	_end = _end.getPrev();
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
	_size += 1;
    }
    
    public void addLast(T x){
	DLLNode<T> node = new DLLNode<T>(x, _end, null);
	_end = node;
	_size += 1;
    }

    public static void main (String[] args){
    }


}