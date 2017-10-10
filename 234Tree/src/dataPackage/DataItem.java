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

    public DataItem() {} 
    public DataItem(String val) {
        this.dData = val;
        this.count = 1;
    }
    public String getItem() {
        return this.dData;
    }
    public int getCount() {
        return this.count;
    }
    
                                ///////////////////////////////////    
                                // Make valid String for DataItem//
                                ///////////////////////////////////    
    public String displayData(){
        return "";
    }
    
    
}