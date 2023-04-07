/* 
Working of Queue Data Structure
---------------------------------
In queues, elements are stored and accessed in First In, First Out manner. That is, elements are added from the behind and removed from the front.
*/

//How to use Queue?
//In Java, we must import java.util.Queue package in order to use Queue

/*
 * // LinkedList implementation of Queue
Queue<String> animal1 = new LinkedList<>();

// Array implementation of Queue
Queue<String> animal2 = new ArrayDeque<>();

// Priority Queue implementation of Queue
Queue<String> animal 3 = new PriorityQueue<>();
 */

/*
 * Methods of Queue
The Queue interface includes all the methods of the Collection interface. It is because Collection is the super interface of Queue.

Some of the commonly used methods of the Queue interface are:

add() - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.
offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.
element() - Returns the head of the queue. Throws an exception if the queue is empty.
peek() - Returns the head of the queue. Returns null if the queue is empty.
remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
poll() - Returns and removes the head of the queue. Returns null if the queue is empty.
 */

//Implementation of the Queue Interface
//1. Implementing the LinkedList Class

package HashMap;

import java.util.Queue;
import java.util.LinkedList;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> number = new LinkedList<>();

        // offer elements to the queue
        number.offer(1);
        number.offer(2);
        number.offer(3);
        System.out.println("Queue : " + number);

        // access elements of the queue
        int Accessnumber = number.peek();
        System.out.println("Accessed element : " + Accessnumber);

        // Remove elements from the queue
        int removednumber = number.poll();
        System.out.println("Removed element : " + removednumber);

        System.out.println("Updated Queue: " + number);
    }
}
