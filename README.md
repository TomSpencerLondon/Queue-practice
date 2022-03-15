# Queue-practice
Practice with implementing a queue

```java
import java.util.*;

Queue<Integer> queue = new LinkedList<Integer>();
// use non-primative types when constructing

// to add a value to the back of queue:
queue.add(7);

// to remove and return front value:
int next = queue.remove();

// to just return front value without removing:
int peek = queue.peek();
```

The Queue interface is available in java.util package and extends the Collection interface. 
The queue collection is used to hold the elements about to be processed and provides various operations like the insertion, removal etc. 
It is an ordered list of objects with its use limited to insert elements at the end of the list and deleting elements from the start of list i.e. it follows the FIFO or the First-In-First-Out principle.

LinkedList, ArrayBlockingQueue and PriorityQueue are the most frequently used implementations.   
![java-queue](https://user-images.githubusercontent.com/27693622/158330344-49e935ae-55ee-499e-8aa5-fd5bcacdfcd0.png)
http://tutorials.jenkov.com/java-collections/queue.html
