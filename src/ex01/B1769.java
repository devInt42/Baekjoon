package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum;
        int cnt=0;
        if(str.length()==1){ //한자리수일경우
            cnt--;
        }
        String res="";
        while(true){
            sum=0;
            cnt++;

            for(int i=0; i<str.length();i++){
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }

            if(sum/10==0){
                res = sum%3==0? "YES":"NO";
                break;
            }
            str= String.valueOf(sum);
        }
        System.out.println(cnt);
        System.out.println(res);

    }

}