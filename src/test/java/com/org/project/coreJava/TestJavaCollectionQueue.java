package com.org.project.coreJava;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class TestJavaCollectionQueue {
    public void priorityQueueMethod() {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

    }
        public void arrayDequeMethod () {
            Deque<String> deque = new ArrayDeque<String>();
            deque.add("Gautam");
            deque.add("Karan");
            deque.add("Ajay");
            //Traversing elements
            for (String str : deque) {
                System.out.println(str);
            }

        }
        public static void main (String args[]) {
        TestJavaCollectionQueue testJavaCollectionQueue = new TestJavaCollectionQueue();
        testJavaCollectionQueue.priorityQueueMethod();
        testJavaCollectionQueue.arrayDequeMethod();
        }
}
