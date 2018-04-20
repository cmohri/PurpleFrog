//Class QQKachoo<T> implements interface Deque<T>

import java.util.NoSuchElementException;

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
    public T pollFirst(){
	if (isEmpty()) return null;
	T retval = peekFirst();
	_front= _front.getNext();
	_size -=1 ;
	return retval;
    }

    //removes the last DLLNode
    //decrements size by 1
    public T pollLast(){
	if (isEmpty()) return null;
	T retval = peekLast();
	_end = _end.getPrev();
	return retval;
    }

    /**Retrieves, but does not remove, the first element of this deque. This met \
    hod differs from peekFirst only in that it throws an exception if this deque is \
    empty.**/
    public T getFirst(){
	if (isEmpty()){
	    throw new NoSuchElementException();
	}
	
	return peekFirst();
    }

    /**
       Retrieves, but does not remove, the last element of this deque. This method differs from peekLast only in that it throws an exception if this deque is  mpty. 
    **/
    public T getLast(){
	if (isEmpty()){
	    throw new NoSuchElementException();
	}
	return peekLast();
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

	a.pollFirst();
	System.out.println(a.peekFirst());
	a.pollFirst();
	System.out.println(a.peekFirst());
	a.pollFirst();
	System.out.println(a.peekFirst());
	//System.out.println(a.getFirst());
	System.out.println(a.getLast());

    }

}