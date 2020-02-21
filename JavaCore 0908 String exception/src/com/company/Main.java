package com.company;

/*

0908 String exception
Catch the exception (and display it), indicating its type that occurs when the code is executed:
String s = null;
String m = s.toLowerCase ();

Requirements:
1. The program should display a message on the screen.
2. The program should have a try-catch block.
3. The program should catch exceptions of a specific type, and not all possible ones (Exception).
4. The output message should contain the type of exception that occurred.
5. Do not delete existing code in the main method.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
     try {
         String s = null;
         String m = s.toLowerCase();
     }
     catch (NullPointerException e) {
         System.out.println(e);
     }}}



