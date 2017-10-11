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
public class DataItem {

    public String dData;
    public int count;

    public DataItem(String term) {
        dData = term;
        count = 1;
    }
    public String getItem() {
        return this.dData;
    }
    public int getCount() {
        return this.count;
    }
    public void displayItem() {
        if (dData.length()<3) 
            System.out.print("\nWord: " + dData + "\t\t\t\tCount: " + count);
        else if (dData.length() < 10)
            System.out.print("\nWord: " + dData + "\t\t\tCount: " + count);
        else
            System.out.print("\nWord: " + dData + "\t\tCount: " + count);
        System.out.println();
    }

    ///////////////////////////////////    
    // Make valid String for DataItem//
    ///////////////////////////////////    


}
