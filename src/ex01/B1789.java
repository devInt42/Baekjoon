package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        long sum = 0;
        long max = 0;
        while(true){
            max++;
            sum+=max;
            if(sum == Long.valueOf(str)){
                break;
            } else if (sum > Long.valueOf(str)) {
                max--;
                break;
            }

        }
        System.out.println(max);


    }
}
