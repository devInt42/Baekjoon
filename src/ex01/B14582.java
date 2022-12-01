package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14582 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[][] arr = new int[2][9];
        int sum1=0;
        int sum2=0;
        int cnt=0;
        String res="No";

            for(int i=0; i<9;i++){
                arr[0][i] = Integer.parseInt(st1.nextToken());
                sum1 += arr[0][i];
                if(sum1>sum2){
                    cnt++;
                    res="Yes";
                }
                arr[1][i] = Integer.parseInt(st2.nextToken());
                sum2 += arr[1][i];
            }

        System.out.println(res);

    }
}
