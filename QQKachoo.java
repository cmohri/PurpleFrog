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
	return _size; //O(1)
    }

    //returns whether the deque is empty
    public boolean isEmpty(){ 
	return (_size <= 0); //O(1)
    }

    //returns value of first, without removing from the deque
    //returns null if the deque is empty
    public T peekFirst(){
	if (isEmpty()){
	    return null;
	}
	return _front.getCargo(); //O(1)
    }//end peekFirst()

    //returns value of end, without removing from the deque
    //returns null if the deque is empty
    public T peekLast(){
	if (isEmpty()){
	    return null;
	}
	return _end.getCargo(); //O(1)
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
    } //O(1)

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
    } //O(1)

    //removes the first DLLNode
    //decrements size by 1
    public T pollFirst(){
	if (isEmpty()) return null;
	T retval = peekFirst();
	_front= _front.getNext();
	_size -=1 ;
	return retval;
    } //O(1)

    //removes the last DLLNode
    //decrements size by 1
    public T pollLast(){
	if (isEmpty()) return null;
	T retval = peekLast();
	if (_size != 1){
		
		_end = _end.getPrev();}
	_size --;
	return retval;
    } //O(1)

    /**Retrieves, but does not remove, the first element of this deque. This met \
    hod differs from peekFirst only in that it throws an exception if this deque is \
    empty.**/
    public T getFirst(){
	if (isEmpty()){
	    throw new NoSuchElementException();
	}
	
	return peekFirst();
    }//O(1)

    /**
       Retrieves, but does not remove, the last element of this deque. This method differs from peekLast only in that it throws an exception if this deque is  mpty. 
    **/
    public T getLast(){
	if (isEmpty()){
	    throw new NoSuchElementException();
	}
	return peekLast();
    }//O(1)

    public String toString() {
	String retVal = "";
	DLLNode<T> temp = _front;
	while (temp != null) {
	    retVal += temp.getCargo() + " ";
	    temp = temp.getNext();
	}
	return retVal;
    }

    public static void main (String[] args){
	QQKachoo<String> a = new QQKachoo<String>();

	System.out.println(a.size()); //Should be 0
	System.out.println(a.isEmpty()); //Should be true
	System.out.println(a.peekFirst()); //Should be null
	System.out.println(a.peekLast()); //Should be null

	a.addFirst("hello");
	System.out.println(a.isEmpty()); //Should be false
        System.out.println(a.peekFirst()); //Should be hello
        System.out.println(a.peekLast()); //Should be hello

	a.addFirst("world");
	System.out.println(a.isEmpty()); //Should be false
        System.out.println(a.peekFirst()); //Should be world
        System.out.println(a.peekLast()); //Should be hello

	a.addLast("!!");
	System.out.println(a.isEmpty()); //Should be false
	System.out.println(a.size()); //Should be 3
        System.out.println(a.peekFirst()); //Should be world
        System.out.println(a.peekLast()); //Should be !!

	a.pollFirst();
	System.out.println(a.peekFirst()); //Should be hello
	a.pollFirst();
	System.out.println(a.peekFirst()); //Should be !!
	a.pollFirst();
	System.out.println(a.peekFirst()); //Should be null
	//System.out.println(a.getFirst());  //Should return error
	//System.out.println(a.getLast()); //Should return error

    }

}
