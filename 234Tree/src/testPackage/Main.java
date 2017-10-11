/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPackage;

import dataPackage.Tree234;

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
        
        tree.insert("all");
        tree.insert("apple");
        tree.insert("a");
        tree.insert("d");
        tree.insert("e");
        tree.insert("f");
        tree.insert("g");
//        tree.insert("apple");
//        tree.insert("can");
//        tree.insert("Johnny");
        tree.displayTree();
        
    }
    
}
