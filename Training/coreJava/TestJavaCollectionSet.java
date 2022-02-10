package com.org.project.coreJava;

import java.util.*;

/**
 * Created by rajender.koyyeda on 07-02-2022.
 */
public class TestJavaCollectionSet {

    public void hashSetMethod() {
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        //Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println("Output of HashSet Method: "+itr.next());
        }
    }
    public void linkedHashSetMethod() {
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println("Output of LinkedHashSet Method: "+itr.next());
        }
    }
    public void treeSetMethod() {
        TreeSet<String> set = new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println("Output of TreeSet Method: "+itr.next());
        }
    }


    public static void main(String args[]){
        TestJavaCollectionSet testJavaCollectionSet = new TestJavaCollectionSet();
        testJavaCollectionSet.hashSetMethod();
        testJavaCollectionSet.linkedHashSetMethod();
        testJavaCollectionSet.treeSetMethod();


    }
}
