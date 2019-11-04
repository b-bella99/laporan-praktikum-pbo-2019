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
public class IntershipEmployee1841720004Bella extends Employee1841720004Bella{
    private int mLenght ;

    public IntershipEmployee1841720004Bella(String mName, int mLenght) {
        this.mLenght = mLenght;
        this.mName = mName;
    }

    public int getmLenghtBella() {
        return mLenght;
    }

    public void setmLenghtBella(int mLenght) {
        this.mLenght = mLenght;
    }

    @Override
    public String getEmployeeInfoBella() {
        String info = super.getEmployeeInfoBella() + "\n";
        info += "Registered as intership employee for " + mLenght + " month/s\n";
        return info;
    }
    
    
}
