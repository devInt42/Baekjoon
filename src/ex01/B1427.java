package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        char[] arr = new char[str.length()];

        for(int i=0;i<arr.length;i++){
            arr[i] = str.charAt(i);
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}
