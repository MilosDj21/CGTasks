package com.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
The end

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        while(true){
            String s = r.readLine();
            if (!s.equals("end")) {
                list.add(s);
            }
            else break;
        }
        for(String x:list){
            System.out.println(x);
        }


    }
}