/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataPackage;

/**
 *
 * @author jt024
 */
public class Tree234 {
    
    private Node root = new Node();
    
    
    
    public Node find(){
        Node curNode = root;
        
        
        while(true){
            if ((childNumber=curNode.findItem(key))!=-1) {
                
            }
        }
        
    }

    public void insert(String term){
        Node focus = root;
        DataItem tempItem = new DataItem(term);
        
//        while(true){
//            if (focus.isFull()) {
////                split(focus);
////                focus = focus.getParent();
////                focus = getNextChild(focus, term);
//            }
//            else if(focus.isLeaf())
//                break;
//            else
//                
//            
//        }
    }
    private void split(Node thisNode){
        DataItem itemB, itemC;
        Node parent, child2, child3;
        int itemIndex;
        
        itemC = thisNode.removeItem();
        itemB = thisNode.removeItem();
        child2 = thisNode.disconnectChild(2);
        child3 = thisNode.disconnectChild(3);
        
        Node newRight = new Node();
        
        if (thisNode==root) {
            root = new Node();
            parent = root;
            root.connectChild(0, thisNode);
        } else
            parent = thisNode.getParent();
        
        itemIndex = parent.insertItem(itemB);
        int n = parent.getNumItems();
        
        for (int j = n-1; j < itemIndex; j--) {
            Node temp = parent.disconnectChild(j);
            parent.connectChild(j+1, temp);
        }
        
        parent.connectChild(itemIndex+1, newRight);
        
        newRight.insertItem(itemC);
        newRight.connectChild(0, child2);
        newRight.connectChild(1, child3);
    }
//    private Node getNextChild(Node theNode, String){
//        
//    }
    
    
    
    
    
    
    
}
