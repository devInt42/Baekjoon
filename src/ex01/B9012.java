package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class B9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            Stack bracket = new Stack();
            String str = br.readLine();
            boolean flag = true;
            for(int j=0; j<str.length();j++) {
                if (str.charAt(j) == '('){
                    bracket.push(str.charAt(j));
                }
                else {
                    if(bracket.empty()==true){
                        flag = false;
                        break;
                    }
                    else {
                        bracket.pop();
                    }
                }
            }
            if(bracket.empty()==false){
                flag = false;
            }
            String res="";
            res = (flag==true)? "YES" : "NO";
            System.out.println(res);
        }
    }
}