package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1531 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[101][101];
        int cnt =0;
        for (int k = 0; k < N; k++) {
            st = new StringTokenizer(br.readLine());
            int leftX = Integer.parseInt(st.nextToken());
            int leftY = Integer.parseInt(st.nextToken());
            int rightX = Integer.parseInt(st.nextToken());
            int rightY = Integer.parseInt(st.nextToken());

            for(int i=leftX; i<=rightX; i++){
                for(int j=leftY; j<=rightY; j++){
                    arr[i][j] += 1;
                }
            }
        }

        for(int i=1; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
                if(arr[i][j] > M) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
