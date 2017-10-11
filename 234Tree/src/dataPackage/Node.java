/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataPackage;

/**
 *  234 Tree Node Only
 * @author jt024
 */
public class Node {
    // Max size
    private static final int SIZE = 4;
    
    private int numItems=0;
    private Node parent;
    private boolean leaf;
    private boolean full;
    private Node[] children = new Node[SIZE];
    private DataItem[] items = new DataItem[SIZE-1];

    //  Connect child to this Node
    public void connectChild(int childNum, Node child){
        children[childNum] = child;
        if (child != null) {
            child.parent = this;
        }
    }

    //  Disconnect child from this Node
    public Node disconnectChild(int childNum){
        
        Node temp= children[childNum];
        
        children[childNum] = null;
        
        return temp;
    }

    // Returns child
    public Node getChild(int childNum){
        return children[childNum];
    }

    // Returns parent
    public Node getParent(){
        return parent;
    }

    public Boolean isLeaf(){
        // test if child is a leaf
        return children[0]==null;
    }
    public int getNumItems(){
        return numItems;
    }
    public DataItem getItem(int index){
        return items[index];
    }
    public Boolean isFull(){
        return (numItems==SIZE-1); 
    }
    public int findItem(String term){
        for (int j = 0; j < SIZE; j++) {
            if (items[j]==null) 
                break;
            else if (items[j].getItem().equalsIgnoreCase(term))
                return j;
        }
        return -1;
    }
    public int insertItem(DataItem newItem){
        numItems++;
	String newKey = newItem.dData;
        
        for (int j = SIZE-2; j>=0 ;j--) {

            if (items[j]==null)
                continue;
            else {
                String itsKey = items[j].dData;
                if (newKey.compareToIgnoreCase(itsKey) > 0) {
                    items[j+1] = items[j];
                }
				else{
					items[j+1] = newItem;
					return j+1;
				}
            }	// end else (not null)
        }		// end for  ---->   //	shifted all items,
		items[0] = newItem;		//	insert new item
        return 0;
    
    }   // end insertItem()
    
    public DataItem removeItem(){
        DataItem temp = items[numItems-1];
        items[numItems-1]=null;
        numItems--;
        return temp;
    }
    
    public void displayItem(){
                System.out.println("got here");
        for (int i = 0; i < numItems; i++) {
            items[i].displayData();
        }
    
    }        
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

