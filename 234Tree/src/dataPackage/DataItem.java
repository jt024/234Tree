/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataPackage;

/**
 *
 * @author hk009
 */
public class DataItem {
    public String dData;
    private int count;

     
    public DataItem(String term) {
        dData = term;
        this.count = 1;
    }
    public DataItem() {}
    public String getItem() {
        return this.dData;
    }



    public int getCount() {
        return this.count;
    }
    public boolean isLess(String compare){
        return compare.compareTo(dData) < 0;
    }
    public boolean isGreater(String compare){
        return compare.compareTo(dData) > 0;
    }    
    
                                ///////////////////////////////////    
                                // Make valid String for DataItem//
                                ///////////////////////////////////    
    public String displayData(){

        return "Word: " + dData+"\tCount: "+ count;
    }
    
    
    
    
    
}