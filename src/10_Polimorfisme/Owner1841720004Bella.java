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
public class Owner1841720004Bella {
    public void payBella(IPayable1841720004Bella p){
        System.out.println("Total payment = " + p.getPaymentAmountBella());
        if(p instanceof ElectricityBill1841720004Bella){
            ElectricityBill1841720004Bella eb = (ElectricityBill1841720004Bella) p;
            System.out.println("" + eb.getBillnfoBella());
        } else if(p instanceof PermanentEmployee1841720004Bella){
            PermanentEmployee1841720004Bella pe = (PermanentEmployee1841720004Bella) p;
            pe.getEmployeeInfoBella();
            System.out.println("" + pe.getEmployeeInfoBella());
        }
    }
    
    public void showMyEmployeeBella(Employee1841720004Bella e){
        System.out.println("" + e.getEmployeeInfoBella());
        if(e instanceof PermanentEmployee1841720004Bella)
            System.out.println("You have to pay her/him monthly!!!");
        else
            System.out.println("No need to pay him/her :)");
    }
}
