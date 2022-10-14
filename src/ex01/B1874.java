package ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class B1874 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        int index = 0; //배열의 인덱스
        ArrayList list = new ArrayList();
        for(int i = 0; i < a.length; i ++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> st = new Stack<>();
        int i = 1;

        while(index < N) {
            if(st.empty()) {
                st.push(i);
                list.add('+');
                i ++;
            }
            else {
                if (st.peek().equals(a[index])) {
                    st.pop();
                    list.add('-');
                    index++;
                    continue;
                } else if (!st.peek().equals(a[index])) {
                    st.push(i);
                    list.add('+');
                    i++;
                }

                if (i > N + 1) {
                    System.out.println("NO");
                    System.exit(0);
                }
            }
        }//end while
        bw.flush();
        for(int k=0; k<list.size(); k++){
            System.out.println(list.get(k));
        }
    }
}