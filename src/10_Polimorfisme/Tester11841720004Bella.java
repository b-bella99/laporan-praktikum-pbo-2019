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
public class Tester11841720004Bella {
    public static void main(String[] args) {
        PermanentEmployee1841720004Bella pEmp = new PermanentEmployee1841720004Bella("Dedik", 500);
        IntershipEmployee1841720004Bella iEmp = new IntershipEmployee1841720004Bella("Sunarto", 5);
        ElectricityBill1841720004Bella eBill = new ElectricityBill1841720004Bella(5, "A-1");
        
        Employee1841720004Bella e;
        IPayable1841720004Bella p;
        
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
        
        //p = iEmp;
        //e = eBill;
    }
}
