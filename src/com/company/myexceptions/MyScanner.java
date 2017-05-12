package com.company.myexceptions;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by adrian on 5/12/17.
 */
public class MyScanner {

    public int getFirstIntFromString(String data) throws Exception {
        Scanner myScanner = new Scanner(data);
        int result;
        ArrayList<Integer> results = new ArrayList<>();

        while (myScanner.hasNext()) {
            if (myScanner.hasNextInt()) {
                results.add(myScanner.nextInt());
            } else
                myScanner.next();
        }

        if (results.size() > 0)
            result = results.get(0);
        else
            throw new Exception("not found any int");

        return result;

    }


}
