package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr = new int[N][2];
        int[][] res = new int[N][2];
        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr,(e1,e2) ->{
           if(e1[1]==e2[1]){
               return e1[0] - e2[0];
           }else {
               return e1[1] - e2[1];
           }
        });


        for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
