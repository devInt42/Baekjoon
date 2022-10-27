package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class B1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int res = 0;
        int me = Integer.parseInt(br.readLine());
        if (num == 1) {
            System.out.println("0");
            System.exit(0);
        }
        Integer[] arr = new Integer[num - 1];
        for (int i = 0; i < num - 1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        while (true) {
            Arrays.sort(arr, Collections.reverseOrder());
            if (me <= arr[0]) {
                me++;
                arr[0]--;
                res++;
            } else {
                System.out.println(res);
                break;
            }
        }
    }
}

