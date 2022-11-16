package ex01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        while((num = Integer.parseInt(br.readLine()))>0){
            String res = br.readLine();
            for( int i=1; i<num;i++){
                String str = br.readLine();
                if(res.toLowerCase().compareTo(str.toLowerCase())>0){
                    res=str;
                }
            }
            System.out.println(res);
        }

    }

}