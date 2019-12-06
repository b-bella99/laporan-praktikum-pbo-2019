/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

/**
 *
 * @author bella
*/;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import unittest.database.Anggota1841720004BellaTest;

public class TestRunnerAnggota1841720004Bella {
    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessorTest1841720004Bella.class);
        showMessageResultBella(mResult, MessageProcessorTest1841720004Bella.class.getSimpleName());
        
        mResult = new JUnitCore().runClasses(Anggota1841720004BellaTest.class);
        showMessageResultBella(mResult, Anggota1841720004BellaTest.class.getSimpleName());
    }

    private static void showMessageResultBella(Result mResult, String className) {
        if(mResult.wasSuccessful()){
            System.out.format("The Result Test %s : %s\n", className, mResult.wasSuccessful());
        }else{
            for(Failure failure : mResult.getFailures()){
                System.out.println(failure);
            }
        }
    }
}
