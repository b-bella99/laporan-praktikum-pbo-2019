/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.poli.percobaan1;

/**
 *
 * @author bella
 */
public class ElectricityBill1841720004Bella implements IPayable1841720004Bella{
    private int mKwh;
    private String mCategory;

    public ElectricityBill1841720004Bella(int mKwh, String mCategory) {
        this.mKwh = mKwh;
        this.mCategory = mCategory;
    }

    public int getmKwhBella() {
        return mKwh;
    }

    public void setmKwhBella(int mKwh) {
        this.mKwh = mKwh;
    }

    public String getmCategoryBella() {
        return mCategory;
    }

    public void setmCategoryBella(String mCategory) {
        this.mCategory = mCategory;
    }

    @Override
    public int getPaymentAmountBella() {
        return mKwh * getBasePriceBella();
    }

    public int getBasePriceBella() {
        int bPrice = 0;
        switch(mCategory){
            case "R-2" : bPrice = 100; break;
            case "R-1" : bPrice = 200; break;
        }
        return bPrice;
    }
    
    public String getBillnfoBella(){
        return "kWH = " + mKwh + "\n" +
                "Category = " + mCategory + "(" + getBasePriceBella() + " per kWH)\n";
    }
}
