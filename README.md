# PurpleFrog
# Clara Mohri, Maryann Foley, Jackie Li

## Container: DLLNodes
Rationale: This way we can have constant running time for addFirst, addLast, removeFirst, removeLast by using the same algorithm we used for LLQueue, but at both ends. It is easy to access both the front and end of the queue by having pointers that point to the front and end of the queue. Using DLLNode methods like setNext() and getNext(), we can have constant running time for all of the methods that we wish to implement.

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
