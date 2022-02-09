
  #     28th jan 2022

  #1 product name================================completed
  #2 print all products names and prices
  #3 order all products
  #4 login user name robot methods enter==============completed
  #5 give username as runtime
  #6 scanner class

#           31st jan 2022
# 7      while loop===fibbonaci series ====>0,0,1,1,2,3,5......
# 8            reverse given number ===123==>321
#  9     for loop===GIven number prime or not
# 10      if -else===>given number even or odd
# 11      switch ===>age=1-10==>kid
#                      11-20==>teenager
#                      21-50==>middle ager
#                      51-100==>oldaged

  ####################### 1st feb 2022###################################################

#1 list the string method          ----- completed
#2 list split regExpressions        ----- Half Completed
#3 write a code for each method   ---completed

###########################2nd feb 2022################################################

    #1     covert any for loop into for each from your existing code
    #2     create class as parent extend to child ....execute parents methods ---------completed
    #3     create parameter constructor for parent class and assign variable values ---------completed
    #4     create interface for automationJob (selenium,java...etc) implement in class ---------completed
    #5     type of inheritance A,B,C,D names as classnames

    #https://www.javatpoint.com/java-tutorial  for oops
    #this ==>https://www.javatpoint.com/this-keyword
    #inheritance ==>https://www.javatpoint.com/inheritance-in-java

  ###########################3rd feb 2022################################################

    #1 string type single dimentional array create and read ......Feature:  ---------completed
    #2 single dimention two arrays and multiply   ---------completed
    #3 multi 3 array ===> add to 4th array ===> 3*3
    #4 copy and clone for above 3 arrays          ---------completed







##################################7th feb 2022##########################################

#  collections -->https://www.javatpoint.com/collections-in-java
#
#  Iterable
#
#  collection--->4 List  Set Map Queues
#
#  List-->   ---allow duplicates,No sync (duplicate element of different data types)
#  ArrayList -->It uses a "dynamic array" to store the duplicate element of different data types. The ArrayList class maintains the insertion order and is non-synchronized.act as a list
#  LinkedList-->It uses a "doubly linked list" internally to store the elements. It can store the duplicate elements. It maintains the insertion order and is not synchronized.act as a list and queue
#  Vector-->dynamic array to store the data elements. It is similar to ArrayList. However, It is synchronized
#  stack-->stack is the subclass of Vector. It implements the last-in-first-out data structure
#List <data-type> list1= new ArrayList();
#List <data-type> list2 = new LinkedList();
#List <data-type> list3 = new Vector();
#List <data-type> list4 = new Stack();
#  --------------------------------------------------------------------------------------------------------------------------
#  Set --> java.util package, No Duplicate,one nul allow
#  HashSet  -->uses a hash table for storage. Hashing is used to store the elements in the HashSet. It contains unique items.
#  LinkedHashSet ->extends the HashSet class and implements Set interface. Like HashSet, It also contains unique elements. It maintains the insertion order and permits null elements.
#
#  SortedSet-->arranged in the increasing (ascending) order.
#  TreeSet-->unique elements. However, the access and retrieval time of TreeSet is quite fast. The elements in TreeSet stored in ascending order.
#
#  ----------------------------------------------------------------------------------
#  map.entrySet()
#  Map.Entry Interface : put ,get ,set keys/values
#  map-->doesn't allow duplicate keys, but you can have duplicate values
#  HashMap-->allow null keys and values,HashMap is the implementation of Map, but it doesn't maintain any order.keys should be unique. If you try to insert the duplicate key, it will replace the element of the corresponding key
#  LinkedHashMap-->allow null keys and values,It inherits HashMap class. It maintains "insertion order".
#  Sortedmap---interface
#  TreeMap-->doesn't allow any null key or value.TreeMap is the implementation of Map and SortedMap. It maintains ascending order.
#  ------------------------------------------
#  HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
#  map.put(1,"Mango");  //Put elements in Map
#  map.put(2,"Apple");
#  map.put(3,"Banana");
#  map.put(4,"Grapes");
#
#  System.out.println("Iterating Hashmap...");
#  for(Map.Entry m : map.entrySet()){
#  System.out.println(m.getKey()+" "+m.getValue());
#  }
#
#  ---------------------------------------------
#
#  Program:::
#  Map map=new HashMap();
#  //Adding elements to map
#  map.put(1,"Amit");
#  //Traversing Map
#  Set set=map.entrySet();//Converting to Set so that we can traverse
#  Iterator itr=set.iterator();
#  while(itr.hasNext()){
#  //Converting to Map.Entry so that we can get key and value separately
#  Map.Entry entry=(Map.Entry)itr.next();
#  System.out.println(entry.getKey()+" "+entry.getValue());
#  ------------------------------------------
#  for(Map.Entry m:map.entrySet()){
#  System.out.println(m.getKey()+" "+m.getValue());
#  }
#
#  --------------------------------------
#  Queue -->  first-in-first-out order. allows duplicate values.
#  PriorityQueue -->It holds the elements/objects which are to be processed by their priorities. It doesn't allow null values,
#  Deque        --->remove and add the elements from both the side. Deque stands for a double-ended queue
#  ArrayDeque -->add or delete the elements from both the ends. ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.


    #create 4 clasess for each type of collection
    #Each class should has methods with their types


    #9th feb 2022

    #1 try to give INFO/DEBUG/ERROR and run the code
    #2 read data from output file ..... take integer and add them in new row