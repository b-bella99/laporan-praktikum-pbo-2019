/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.database.percobaan2;

/**
 *
 * @author bella
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CobaArrayList1841720004Bella {
    public static void main(String[] args) {
        List mListCountry = new ArrayList();
        
        mListCountry.add("Indonesia");
        mListCountry.add("Malaysia");
        mListCountry.add("German");
        
        /*System.out.println(mListCountry);
        System.out.format("List index 0 = %s\n", mListCountry.get(0));
        System.out.format("List index 2 = %s\n", mListCountry.get(2));
        */
        System.out.println("Country List");
        Iterator mIterator = mListCountry.iterator();
        while(mIterator.hasNext()){
            Object elemen = mIterator.next();
            System.out.format("%s", elemen);
        }
    }
}
