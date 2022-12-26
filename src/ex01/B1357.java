package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        System.out.println(Rev(Rev(X)+Rev(Y)));
    }

    static int Rev(int num) {
        int res = 0;
        int cnt = 1;
        int len = (int)(Math.log10(num)+1);
        while (len>0) {
            res += (num % 10) * Math.pow(10, len-1);
            num/=10;
            len--;
            cnt++;
        }
        return res;
    }
}
