package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str;
        Stack stack = new Stack<>();
        for (int i = 0; i < num; i++) {
            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int cnt = 0;
            while (st.hasMoreTokens()) {
                String s = st.nextToken();
                for (int k = 0; k < s.length(); k++) {
                    stack.push(s.charAt(k));
                }
                for (int j = 0; j < s.length(); j++) {
                    System.out.print(stack.peek());
                    stack.pop();
                }
                if (st.hasMoreTokens()) {
                    System.out.print(" ");
                }
            }
        }

    }
}
