package com.cuc.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author wuken666
 * @create 2020-11-07 14:49
 */
public class Hello {

    public static void main(String[] args) {

        List<String> list= new ArrayList();
        HashMap<String,String> hashMap = new HashMap<>();
        String sss = new String();
        System.out.println("123");
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }
        for (String s : list) {
            System.out.println("s = " + s);
        }

    }
}
