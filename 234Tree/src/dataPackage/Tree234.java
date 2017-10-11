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
    
    private Node root;
    
    
    public Tree234(){
        root = new Node();
        
    }
    
    
    public void insert(String dValue){
        Node focus = root;
        DataItem tempItem = new DataItem(dValue);
        

        
        while(true){
            if (focus.isFull()) 
            {
                split(focus);
                focus = focus.getParent();
                focus = getNextChild(focus, dValue);
            } // end if (node is full)
            else if(focus.isLeaf())
                break;
            // node is not full, not a leaf; so go to lower level
            else
                focus = getNextChild(focus, dValue);
        }  // end while
        
        // insert new DataItem
        focus.insertItem(tempItem); 
    }    // end insert
    private void split(Node thisNode){ // split the node

        // assumes node is full
        DataItem itemB, itemC;

        Node parent, child2, child3;

        int itemIndex;
        
        // two right most items are removed from the node and stored
        itemC = thisNode.removeItem();
        itemB = thisNode.removeItem();
        child2 = thisNode.disconnectChild(2);
        child3 = thisNode.disconnectChild(3);
        
        // make new node, goes to the right of the node being split
        Node newRight = new Node();
        
        
        if (thisNode==root) { // if this is the root
            // make new root
            root = new Node();
            // root is our parent
            parent = root;
            // connect to parent
            root.connectChild(0, thisNode);
        } 
        else // this node not the root
            // get parent
            parent = thisNode.getParent();
        // item B is inserted in the parent node
        itemIndex = parent.insertItem(itemB); // deal with parent
        // total items?
        int n = parent.getNumItems(); 
        
        // move parent's connections
        // one child to the right
        for (int j = n-1; j < itemIndex; j--) { 
            Node temp = parent.disconnectChild(j);
            parent.connectChild(j+1, temp);
        }
        // connect newRight to parent
        parent.connectChild(itemIndex+1, newRight);

        // deal with newRight
        newRight.insertItem(itemC);             // item C to newRight
        newRight.connectChild(0, child2);       // connect to 0 and 1
        newRight.connectChild(1, child3);       // on newRight
    }   // end split()
    private Node getNextChild(Node theNode, String keyWord){
        int j;        
        // assumes node is not empty, not full, not a leaf
        int numItems = theNode.getNumItems();

        // for each item in node
        for(j=0; j<numItems; j++)          
        {   // is the value given less than the value at the 
            //first index of the array?                           
            if( keyWord.compareToIgnoreCase(theNode.getItem(j).dData)<0) {
                // if so, return left child so we can use it at another 
                // point in time
                return theNode.getChild(j); 
            }
                
        } // end for
        return theNode.getChild(j);
        // otherwise, our value is greater we're greater, so
        // we return right child (the child right after the 
        // value given, greater)        
    }
    
    public void displayTree(){
        recDisplayTree(root, 0, 0);
    }
   private void recDisplayTree(Node thisNode, int level,int childNumber)
      {
      System.out.print("level="+level+" child="+childNumber+" ");
        thisNode.displayItem();               // display this node
 
      // call ourselves for each child of this node
      int numItems = thisNode.getNumItems();
      for(int j=0; j<numItems+1; j++)
         {
         Node nextNode = thisNode.getChild(j);
         if(nextNode != null)
            recDisplayTree(nextNode, level+1, j);
         else
            return;
         }
      }         // end recDisplayTree()

   public int find(String searchTerm) // find data item with given key
      {
      Node focus = root; // current node = root
      int childNumber; // reference to index of child
      while(true)
         {
          // we set childNumber to = the currentNode.findItem(key) which returns the index of the matching value
          // if the matching value is not found, findItem() returns -1
          // if childNumber is found, we return that index
         if(( childNumber = focus.findItem(searchTerm) ) != -1)
            return childNumber;               // found it
         else if( focus.isLeaf() ) // if the current node is a leaf, we can't go farther down
            return -1;                        // can't find it
         else                                 // search deeper, current node is not a leaf
            focus = getNextChild(focus, searchTerm); // figures out which of the node's children it should go to next
         }  // end while
      }


}               // end class Tree234
