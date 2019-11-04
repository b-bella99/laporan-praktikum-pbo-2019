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
public class Tester41841720004Bella {
    public static void main(String[] args) {
        Owner1841720004Bella ow = new Owner1841720004Bella();
        ElectricityBill1841720004Bella eBill = new ElectricityBill1841720004Bella(5, "R-1");
        ow.payBella(eBill);//pay for electricity bill
        System.out.println("------------------------------------------------------------");
        
        PermanentEmployee1841720004Bella pEmp = new PermanentEmployee1841720004Bella("Dedik", 500);
        ow.payBella(pEmp);//pay for permanent employee
        System.out.println("------------------------------------------------------------");
        
        IntershipEmployee1841720004Bella iEmp = new IntershipEmployee1841720004Bella("Sunarto", 5);
        ow.showMyEmployeeBella(pEmp);//pay for permanent employee
        System.out.println("------------------------------------------------------------");
        ow.showMyEmployeeBella(iEmp);//show intership employee info
        
        //ow.payBella(iEmp);
    }
}
