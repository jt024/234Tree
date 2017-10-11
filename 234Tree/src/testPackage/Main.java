/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPackage;

import dataPackage.RandomName;
import dataPackage.Tree234;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hk009
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tree234 tree = new Tree234();
        
//        String value="";
        for (int i = 0; i < 3000; i++) {
            String temp = RandomName.getLast();
            System.out.println(temp);
            tree.insert(temp); 
        }
       
//        tree.insert(RandomName.getFFull());
//        tree.insert("a");
//        tree.insert("a");
//        tree.insert("apple");
//        tree.insert("apple");
//        tree.insert("a");
//        tree.insert("dere");
//        tree.insert("edfg");
//        tree.insert("fqwe");
//        tree.insert("qwea");
//        tree.insert("drew");
//        tree.insert("eerqweqt");
//        tree.insert("fweqwerqwerqwerrwer");
//        tree.insert("nnnfvedqweqfg");
//        tree.insert("zzzfqwqwee");
//        tree.insert("qwssdfsea");
//        tree.insert("dreqwew");
//        tree.insert("eeqwert");
//        tree.insert("fweqwerwer");        
        tree.displayTree();
        
        

//        tree.insert("g");
//        tree.insert("apple");
//        tree.insert("can");
//        tree.insert("Johnny");

//        while(true) {
//            putText("Enter first letter of ");
//            putText("show, insert, or find: ");
//            char choice; = getChar();
//         
//         
//            switch(choice) {
//                case 's':
//                  tree.displayTree();
//                  break;
//                case 'i':
//                  putText("Enter value to insert: ");
//                  try{
//                    value = getString();
//                  }catch(IOException ex){
//
//                  }
//                  tree.insert(value);
//                  break;
//                case 'f':
//                  putText("Enter value to find: ");
//                  value = getString();
//                  int found = tree.find(value);
//                  if(found != -1)
//                    System.out.println("Found "+value);
//                  else
//                    System.out.println("Could not find "+value);
//                    break;
//                default:
//                    putText("Invalid entry\n");
//            }  // end switch
//        }  // end while
    }

    public static void putText(String s) {
        System.out.print(s);
        System.out.flush();
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
