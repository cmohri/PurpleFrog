# PurpleFrog
# Clara Mohri, Maryann Foley, Jackie Li

## Container: DLLNodes
Rationale: This way we can have constant running time for addFirst, addLast, removeFirst, removeLast by using the same algorithm we used for LLQueue, but at both ends. It is easy to access both the front and end of the queue by having pointers that point to the front and end of the queue. Using DLLNode methods like setNext() and getNext(), we can have constant running time for all of the methods that we wish to implement.

## Method Selections: 

```
- int size()
- boolean isEmpty()
- void addFirst(T x), void addLast(T x)
- T peekFirst(), T peekLast()
- T removeFirst(), T removeLast()
- T getFirst(), T getLast()
- T pollFirst(), T pollLast()
````

__Rationale:__ These methods provide the basics for a double-ended queue. They provide the same structure of functionality that a one-ended queue provides. 

## To-do list: 
1. Set instance variables: \_first , \_last, \_size
2. Implement size() method 
    
    Functionality: returns \_size's value
    
    Should have constant running time, as accessor method.
3. Implemeent isEmpty() method

    Functionality: returns whether the Deque is empty.
    
    Should have constant running time.
4. Implement addFirst(T x) and addLast(T x)
    
    Functionality: Add to the front or end of the Deque.
    
    These methods should have constant running time. 
5. Implement peekFirst() and peekLast()
    
    Functionality: Return getValue of \_first, \_last respectively and return null if the Deque is empty.
    
    These methods should have constatn running time.
6. Implement getFirst() and getLast()
     
     Functionality: Return getValue of \_first, \_last respectively and throw an error if the Deque is empty. 
     
     These should have constant running time        
7. Implement pollFirst() and pollLast()
     
     Functionality: Remove the respective node, and return null if the Deque is empty.
     
     These should have constant running time. 
8. Implement removeFirst() and removeLast()
     
     Functionality: Remove the first or last element of the Deque and throw an error if the Deque is empty.
     
     These methods should have constant running time. 
8. Robustify by throwing exceptions, etc.

## Dev Plan: 
\_first, \_last will be instance variables of the type DLLNode<T>
\_size will be an instance variable of the type int

size() will return the value of the instance variable \_size.

isEmpty() will return whether \_size is <= 0.

addFirst(T x) will make a DLLNode<T> with x as its cargo/value. This DLLNode<T> will then set its next to _first, and the _first pointer will switch to point to the DLLNode<T> this method created.

addLast(T x) will make a DLLNode<T> with x as its cargo/value. The DLLNode<T> at _last will set its next to the DLLNode<T> just created, and the _last pointer will switch to poin to the DLLNode<T> this method created.
    
peekFirst() will use the DLLNode method getValue() to return the value of the DLLNode<T> pointed to by _front.
    
peekLast() will use the DLLNode method getValue() to return the value of the DLLNode<T> pointed to by _last.
    
removeFirst() will change the \_front pointer so that it points to \_front.getNext(). If the Deque is empty, then a a NoSuchElementException will be thrown.

removeLast() will change the \_last pointer so that it points to \_front.getLast(). If the Deque is empty, then a a NoSuchElementException will be thrown.

pollFirst() will set the front node to the node after what is currently \_front, therefore removing the front node. If the Deque is empty, then null will be returned.

pollFirst() will set the last node to the node before what is currently \_end, therefore removing the end node. If the Deque is empty, then null will be returned.

getFirst() will return the cargo of the \_front node.

getLast() will return the cargo of the \_end node.

## Changes

* Updated the methods in QQKachoo to include runtime efficiencies
* Added a toString() method in QQKachoo
