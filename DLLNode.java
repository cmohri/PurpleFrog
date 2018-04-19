/*****************************************************
 * class DLLNode v1
 * Implements a node, for use in lists and other container classes.
 * Stores a String as cargo.
 *****************************************************/

public class DLLNode<T>
{
  private T _cargo;    //cargo may only be of type String
  private DLLNode<T> _nextNode, _prevNode; //pointers to next, prev DLLNodes


  // constructor -- initializes instance vars
  public DLLNode( T value, DLLNode prev, DLLNode next )
  {
    _cargo = value;
    _nextNode = next;
    _prevNode = prev;
  }


  //--------------v  ACCESSORS  v--------------
  public String  getCargo() { return _cargo.toString(); }

  public DLLNode<T> getNext() { return _nextNode; }

  public DLLNode<T> getPrev() { return _prevNode; }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public String setCargo( T newCargo )
  {
    String foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public DLLNode<T> setNext( DLLNode<T> newNext )
  {
    DLLNode<T> foo = getNext();
    _nextNode = newNext;
    return foo;
  }

  public DLLNode<T> setPrev( DLLNode<T> newPrev )
  {
      DLLNode<T> foo = getPrev();
      _prevNode = newPrev;
      return foo;
  }
  //--------------^  MUTATORS  ^--------------
  
  
  // override inherited toString
  public String toString() { return _cargo.toString(); }

  //main method for testing
  public static void main( String[] args )
  {
    //Below is an exercise in creating a linked list...
      /**

     //Create a node
      DLLNode<String> first = new DLLNode<String>( "cat", null , null);
      DLLNode<String> next = new DLLNode<String>("dog", null, null);
      first.setNext(next);
      System.out.println(first.getCargo());
      System.out.println(first.getNext());
      
      **/

  }//end main

}//end class DLLNode
