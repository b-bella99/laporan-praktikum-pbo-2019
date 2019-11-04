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
public class PermanentEmployee1841720004Bella extends Employee1841720004Bella implements IPayable1841720004Bella{
    
    private int mSalary;

    public PermanentEmployee1841720004Bella(String mName, int mSalary) {
        this.mName = mName;
        this.mSalary = mSalary;
    }

    public int getmSalaryBella() {
        return mSalary;
    }

    public void setmSalaryBella(int mSalary) {
        this.mSalary = mSalary;
    }
    
    @Override
    public int getPaymentAmountBella() {
        return(int)(mSalary + 0.05 * mSalary);
    }

    @Override
    public String getEmployeeInfoBella() {
        String info = super.getEmployeeInfoBella() + "\n";
        info += "Registered as permanent employee with salary " + mSalary + "\n";
        return info;
    }
    
}
