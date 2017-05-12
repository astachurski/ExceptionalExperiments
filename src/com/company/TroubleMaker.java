package com.company;

import com.company.myexceptions.Trouble;

/**
 * Created by adrian on 5/12/17.
 */
public class TroubleMaker {
    public String getSomeText() throws Trouble {
        return generateSomeText();
    }

    private String generateSomeText() throws Trouble {
        return textGenerator();
    }

    private String textGenerator() throws Trouble {
        if (true)
            throw new Trouble("this is serious!");
        return "here is some text";
    }
}
