package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for(int i=0; i<arr.length;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<2;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<arr.length;i++){
            int rank =1;
            for(int j = 0 ; j<arr.length; j++){
                if(i==j){
                    continue;
                }

                if(arr[i][0] < arr[j][0] && arr[i][1]<arr[j][1]){
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }



    }
}
