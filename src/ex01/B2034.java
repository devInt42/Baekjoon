package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int cnt = 0;
        int res = 0;
        char[] scale = {'A','X','B','C','X','D','X','E','F','X','G','X'};
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        //65
        for (int i = 0; i < 12; i++) {     // A~G
            if (scale[i]=='X') {
                continue;
            }
            cnt = i;
            res = i;
            for (int j = 0; j < arr.length; j++) {
                if (scale[res]=='X') {
                    break;
                }
                res += arr[j];
                if (res > 11) {
                    res %= 12;
                } else if (res < 0) {
                    res = 12 - (Math.abs(res) % 12);
                    if(res==12){
                        res=0;
                    }
                }
            }
            if (scale[cnt]!='X' && scale[res]!='X') {
                System.out.println(scale[cnt]+" "+scale[res]);
            }
        }


    }
}
