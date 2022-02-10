package com.org.project.coreJava;

import java.util.*;

/**
 * Created by rajender.koyyeda on 07-02-2022.
 */
public class TestJavaCollectionList {

    public void arrayListMethod(){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        //Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println("Output of ArrayList Method: "+itr.next());
        }
    }

    public void LinkedListMethod(){
        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println("Output of LinkedList Method: "+itr.next());
        }

    }

    public void vectorMethod(){
        Vector<String> v=new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println("Output of Vector Method: "+itr.next());
        }

    }

    public void stackMethod(){
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();
        Iterator<String> itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println("Output of Stack Method: "+itr.next());
        }

    }
    public static void main(String args[]){
        TestJavaCollectionList testJavaCollectionList = new TestJavaCollectionList();
        testJavaCollectionList.arrayListMethod();
        testJavaCollectionList.LinkedListMethod();
        testJavaCollectionList.vectorMethod();
        testJavaCollectionList.stackMethod();




    }
}
