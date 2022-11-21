package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1439{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split("");
        int zero = 0, one = 0;

        if(arr[0].equals("0"))
            zero++;
        else
            one++;

        for(int i = 1; i < arr.length; i++) {
            if(!arr[i-1].equals(arr[i])) {
                if(arr[i].equals("0"))
                    zero++;
                else
                    one++;
            }
        }
        System.out.println(Math.min(zero, one));
    }
}