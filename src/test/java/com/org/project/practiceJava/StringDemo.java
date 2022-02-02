package com.org.project.practiceJava;

import java.util.Locale;

public class StringDemo {

    public static void main (String args[]) {
        String a = "Govardhan is a Student";
        String b = "govardhan is a Employee";
        String x = "hellow";
        String xx = "Hellow";
        String y = "Govardhan";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+" & "+b);
        System.out.println(a.charAt(8));
        System.out.println(a.codePointAt(8));
        System.out.println(a.codePointBefore(8));
        System.out.println(a.codePointCount(3,8));
        System.out.println(a==b);
        System.out.println(x.compareTo(y));
        System.out.println(x.compareToIgnoreCase(y));
        System.out.println(x.concat(" "+y));
        System.out.println(y.contains("dhan"));
        System.out.println(y.contains("govar"));
        System.out.println(x.contentEquals(y));

        char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
        String myStr2 = "";
       // myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
      //  System.out.println("Returned String: " + myStr2);
        System.out.println(myStr2.copyValueOf(myStr1,0,5));
        System.out.println(x.endsWith("io"));
        System.out.println(x.endsWith("llo"));
        System.out.println(x.equals(xx));
        System.out.println(x.equalsIgnoreCase(xx));
        System.out.println(String.format(x, y));
        System.out.println(x.hashCode());
        System.out.println(x.getBytes());
        System.out.println(a.lastIndexOf("Student"));
        System.out.println(x.length());
        System.out.println(a.matches("Govardhan"));
        System.out.println(x.replace('e','a'));
        System.out.println(x.replaceAll("hellow","hallow"));
        System.out.println(x.toLowerCase());
        System.out.println(x.toUpperCase());
        System.out.println(x.toString());

    }
}
