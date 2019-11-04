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
public class Tester21841720004Bella {
    public static void main(String[] args) {
        PermanentEmployee1841720004Bella pEmp = new PermanentEmployee1841720004Bella("Dedik", 500);
        Employee1841720004Bella e;
         
        e = pEmp;
        System.out.println("" + e.getEmployeeInfoBella());
        System.out.println("---------------------------");
        System.out.println("" + pEmp.getEmployeeInfoBella());
    }
}
