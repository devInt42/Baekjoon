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
        int first[] = new int[N];
        int arr[] = new int[M];
        for (int i = 0; i < first.length; i++) {
            first[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(first);

        for (int i = 0; i < arr.length; i++) {
            int top = first.length-1, mid, bot = 0;
            boolean flag=false;
            while (top >= bot) {
                mid = (top + bot) / 2;

                if(first[mid]>arr[i]){
                    top=mid-1;
                } else if (first[mid]<arr[i]) {
                    bot=mid+1;
                } else {
                    flag=true;
                    System.out.println("1");
                    break;
                }
            }
            if(flag == false){
                System.out.println("0");
            }
        }

    }
}
