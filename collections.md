# Collections

In Java, the standard collections framework is provided by the `java.util` package. It includes several interfaces and classes for representing and manipulating collections of objects. Here are the main interfaces and classes in the Java collections framework:

1. **Interfaces**:
   - **Collection**: The root interface in the collections hierarchy. It represents a group of objects known as elements. Implementations of this interface include List, Set, and Queue.
   - **List**: An ordered collection (sequence) that allows duplicate elements. Implementations include ArrayList, LinkedList, and Vector.
   - **Set**: A collection that contains no duplicate elements. Implementations include HashSet, LinkedHashSet, and TreeSet.
   - **Queue**: A collection used to hold elements prior to processing. Implementations include LinkedList (acting as a queue), PriorityQueue, and ArrayDeque.
   - **Map**: An object that maps keys to values. Implementations include HashMap, TreeMap, LinkedHashMap, and Hashtable.

2. **Classes**:
   - **ArrayList**: Implements the List interface using a dynamic array.
   - **LinkedList**: Implements the List and Queue interfaces using a doubly-linked list.
   - **HashSet**: Implements the Set interface using a hash table.
   - **LinkedHashSet**: Implements the Set interface using a hash table with linked list running through it, providing insertion-ordered iteration.
   - **TreeSet**: Implements the Set interface using a sorted tree structure.
   - **HashMap**: Implements the Map interface using a hash table.
   - **TreeMap**: Implements the Map interface using a red-black tree.
   - **LinkedHashMap**: Implements the Map interface with predictable iteration order, maintaining a linked list of entries.
   - **Hashtable**: A legacy class similar to HashMap but synchronized (thread-safe).
   - **Vector**: A legacy class similar to ArrayList but synchronized (thread-safe).
   - **PriorityQueue**: An unbounded priority queue based on a priority heap.
   - **ArrayDeque**: A resizable-array implementation of the Deque interface.

3. **Utilities**:
   - **Collections**: A utility class that provides static methods for operating on collections, such as sorting, searching, and synchronizing.
   - **Arrays**: A utility class that provides static methods for manipulating arrays, such as sorting and searching.

These interfaces and classes provide a rich set of functionalities for working with collections of objects in Java. They offer various data structures and algorithms to suit different requirements and use cases, making Java a versatile language for developing applications.