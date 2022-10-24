package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[][] arr = new String[num][2];
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < num ; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = st.nextToken();
            }
        }

        Arrays.sort(arr);
        for(int i=0;i<num;i++){
            for(int j=0;j<2;j++){
                sb.append(arr[i][j]);
                if(j==0) sb.append(" ");
                else sb.append("\n");
            }
        }
    }
}
