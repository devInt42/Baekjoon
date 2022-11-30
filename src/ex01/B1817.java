package ex01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int sum =0;
        int res=0;
        if(N==0){
            System.out.println(0);
            System.exit(0);
        }
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<arr.length;i++){
            sum+= arr[i];
            if(sum==M){
                res++;
                sum=0;
            }else if(sum>M){
                res++;
                sum= arr[i];
            }
        }
        if(sum!=0){
            res++;
        }
        System.out.println(res);
    }
}
