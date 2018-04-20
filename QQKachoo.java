//Class QQKachoo<T> implements interface Deque<T>
public class QQKachoo<T> implements Deque<T>{

    //instance vars: 
    private DLLNode<T> _front;
    private DLLNode<T> _end;
    private int _size;

    //construcotr: 
    public QQKachoo(){
	_front = null;
	_end = null;
	_size = 0;
    }

    //returns the value of the size attribute
    public int size(){
	return _size;
    }

    //returns whether the deque is empty
    public boolean isEmpty(){
	return (_size <= 0);
    }

    //returns value of first, without removing from the deque
    //returns null if the deque is empty
    public T peekFirst(){
	if (isEmpty()){
	    return null;
	}
	return _front.getCargo();
    }//end peekFirst()

    //returns value of end, without removing from the deque
    //returns null if the deque is empty
    public T peekLast(){
	if (isEmpty()){
	    return null;
	}
	return _end.getCargo();
    }//end peekLast()

    //adds to the front
    //increments size by 1
    public void addFirst(T x){
	DLLNode<T> foo = new DLLNode<T>(x, null, null);
	if (isEmpty()){
	    _front = foo;
	    _end = foo;
	}
	else {
	    foo.setNext(_front);
	    _front = foo;
	}
	_size += 1;
    }

    //adds to the end
    //increments size by 1
    public void addLast(T x){
	DLLNode<T> foo = new DLLNode<T>(x, null, null);
	if (isEmpty()){
            _front = foo;
            _end = foo;
	}
	else {
            _end.setNext(foo);
            _end = foo;
	}
        _size +=1;
    }

    //removes the first DLLNode
    //decrements size by 1
    public T removeFirst(){
	if (isEmpty()) return null;
	T retval = peekFirst();
	_front= _front.getNext();
	_size -=1 ;
	return retval;
    }

    //removes the last DLLNode
    //decrements size by 1
    public T removeLast(){
	if (isEmpty()) return null;
	T retval = peekLast();
	_end = _end.getPrev();
	return retval;
    }

    

    public static void main (String[] args){
	QQKachoo<String> a = new QQKachoo<String>();

	System.out.println(a.size());
	System.out.println(a.isEmpty());
	System.out.println(a.peekFirst());
	System.out.println(a.peekLast());

	a.addFirst("hello");
	System.out.println(a.isEmpty());
        System.out.println(a.peekFirst());
        System.out.println(a.peekLast());

	a.addFirst("world");
	System.out.println(a.isEmpty());
        System.out.println(a.peekFirst());
        System.out.println(a.peekLast());

	a.addLast("!!");
	System.out.println(a.isEmpty());
	System.out.println(a.size());
        System.out.println(a.peekFirst());
        System.out.println(a.peekLast());

	a.removeFirst();
	System.out.println(a.peekFirst());
	a.removeFirst();
	System.out.println(a.peekFirst());
	a.removeFirst();
	System.out.println(a.peekFirst());

    }

}