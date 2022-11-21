package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();
        int[] arr = new int[10];
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - 48;
            arr[num] += 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == 6) {
                arr[9] += arr[6];
                arr[6] = 0;
            }
            if (i == 9) {
                arr[9] = (int) Math.ceil((double) arr[9] / 2);
            }
            if (arr[i] > res) {
                res = arr[i];
            }
        }
        System.out.println(res);
    }
}
