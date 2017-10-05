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
class NLoad {
    private String pfvString;
    private int pfvInt;
    private int[] pfvIntArray;
    private String[] pfvStringArray;
    private Object val;

    public NLoad() {} 
    public NLoad(String val) {
        this.val = pfvString = val;
    }
    public NLoad(int val) {
        this.val = pfvInt = val;
    }

    public NLoad(int[] val) {
        this.val = pfvIntArray = val;
    }
    public NLoad(String[] val) {
        this.val = pfvStringArray = val;
    }
    
    public String getVal() {
        return this.val.toString();
    }
    public String getVal(String val) {
        return pfvString;
    }
    public String getVal(String val) {
        return pfvString = val;
    }
    public String getVal (String val) {
        return pfvString = val;
    }
   
    
}

//   public void displayItem()
//      { System.out.print("/"+dData); }

