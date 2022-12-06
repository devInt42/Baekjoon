package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int arrA[] = new int[N];
        int arr[] = new int[M];
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        Arrays.sort(arrA);

        for (int i = 0; i < arr.length; i++) {
            int top = arr[N - 1], mid, bot = 0;

            while (top >= bot) {
                mid = (top + bot) / 2;


            }
            System.out.println(res);

        }

    }
}
