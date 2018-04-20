# PurpleFrog
# Clara Mohri, Maryann Foley, Jackie Li

## Container: DLLNodes
Rationale: This way we can have constant running time for addFirst, addLast, removeFirst, removeLast by using the same algorithm we used for LLQueue, but at both ends. It is easy to access both the front and end of the queue by having pointers that point to the front and end of the queue. Using DLLNode methods like setNext() and getNext(), we can have constant running time for all of the methods that we wish to implement.

## Method Selections: 

```
- int size()
- void addFirst(T x), void addLast(T x)
- T peekFirst(), T peekLast()
- T removeFirst(), T removeLast()
````

__Rationale:__ These methods provide the basics for a double-ended queue. They provide the same structure of functionality that a one-ended queue provides. 

## To-do list: 
1. Set instance variables: \_first , \_last, \_size
2. Implement size() method: returns \_size's value
3. Implement addFirst(T x) and addLast(T x)
    These should have constant running time
4. Implement peekFirst() and peekLast()
     Return getValue of \_first, \_last respectively
5. Implement removeFirst() and removeLast()
     These should have constant running time
6. Robustify by throwing exceptions, etc.

## Dev Plan: 
\_first, \_last will be instance variables of the type DLLNode<T>
\_size will be an instance variable of the type int

addFirst(T x) will make a DLLNode<T> with x as its cargo/value. This DLLNode<T> will then set its next to _first, and the _first pointer will switch to point to the DLLNode<T> this method created.

addLast(T x) will make a DLLNode<T> with x as its cargo/value. The DLLNode<T> at _last will set its next to the DLLNode<T> just created, and the _last pointer will switch to poin to the DLLNode<T> this method created.
    
peekFirst() will use the DLLNode method getValue() to return the value of the DLLNode<T> pointed to by _front.
    
peekLast() will use the DLLNode method getValue() to return the value of the DLLNode<T> pointed to by _last.
    
removeFirst() will change the \_front pointer so that it points to \_front.getNext().

removeLast() will change the \_last pointer so that it points to \_front.getLast().
