/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.database.percobaan3;

/**
 *
 * @author bella
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class DemoHashMap1841720004Bella {
    public static void main(String[] args) {
        HashMap hMapItem = new HashMap();
        hMapItem.put("1", "Biskuit");
        hMapItem.put("2", "Shampoo");
        hMapItem.put("3", "Soap");
        System.out.println(hMapItem);
        
        //script yang ditambahkan
        Collection mCollection = hMapItem.values();
        Iterator mItrator = mCollection.iterator();
        while(mItrator.hasNext()){
            System.out.println(mItrator.next());
        }   
        
        System.out.format("HashMap Item Total %d\n\n", hMapItem.size());
        
        Object mObject = hMapItem.remove("1");
        System.out.format("%s remove from HashMap\n",mObject);
        System.out.format("HashMap Item Total : %d\n", hMapItem.size());
        System.out.println(hMapItem);
        
        hMapItem.clear();
        System.out.format("HashMap Item Total : %d\n",hMapItem.size());
    }
}
