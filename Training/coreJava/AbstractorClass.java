package com.org.project.coreJava;

/**
 * Created by rajender.koyyeda on 02-02-2022.
 */
abstract class AbstractorClass{
    abstract void run();

    public void add() {
        System.out.println("add normal method");
    }
}
class Honda4 extends AbstractorClass{
    void run(){
        System.out.println("running safely");
    }

    public static void main(String args[]){
        AbstractorClass obj = new Honda4();
        obj.run();
        obj.add();
    }
}
