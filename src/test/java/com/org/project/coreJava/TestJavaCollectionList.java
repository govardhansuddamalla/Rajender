package com.org.project.coreJava;

import java.util.ArrayList;
import java.util.Iterator;

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
            System.out.println(itr.next());
        }
    }

    public void LinkedListMethod(){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist

    }

    public void vectorMethod(){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist

    }

    public void stackMethod(){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist

    }
    public static void main(String args[]){
        TestJavaCollectionList testJavaCollectionList = new TestJavaCollectionList();
        testJavaCollectionList.arrayListMethod();




    }
}
