package com.org.project.practiceJava;

public class SplitDemo {
    public static void main (String args []){

        String x="Govardhan is a Student";

       /* String[] x2=x.split("h");
        System.out.println(x2[0]);
        String[] x1=x.split("is");
        System.out.println(x1[0]);
        System.out.println(x1.length);*/

        String strg = "gova@rdhan@is @ a boy";
        String[] arrystrg = strg.split("@",2);
        String a = String.valueOf(arrystrg[1]);
        System.out.println(a);


        String[] result = "a:b,c\"d{e[f g}h]i".split("[:,\"{\\[ }\\]]");
        System.out.print(result.length);

    }

}
