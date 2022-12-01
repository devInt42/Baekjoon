package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1925 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[3][2];
        String res="";
        double[] leg = new double[3];
        for(int i=0; i<arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        //삼각형 넓이 구하기 신발끈 공식  0이면 일직선, 아니면 삼각형
        if(arr[0][0]*arr[1][1]+arr[1][0]*arr[2][1]+arr[2][0]*arr[0][1]-(arr[1][0]*arr[0][1]+arr[2][0]*arr[1][1]+arr[0][0]*arr[2][1])!=0){
        leg[0] =  Math.sqrt(Math.pow(arr[0][0]-arr[1][0],2)+ Math.pow(arr[0][1]-arr[1][1],2));
        leg[1]  =  Math.sqrt(Math.pow(arr[1][0]-arr[2][0],2)+ Math.pow(arr[1][1]-arr[2][1],2));
        leg[2]  =  Math.sqrt(Math.pow(arr[2][0]-arr[0][0],2)+ Math.pow(arr[2][1]-arr[0][1],2));
        Arrays.sort(leg);
        if(leg[0]==leg[1] && leg[1]==leg[2]){
            res="JungTriangle";
        } else if (leg[0]==leg[1] ||leg[1]==leg[2] ||leg[2]==leg[0]) {
            if(leg[2] == Math.sqrt(Math.pow(leg[0],2)+Math.pow(leg[1],2))){
                res="Jikkak2Triangle";
            } else if (leg[2] > Math.sqrt(Math.pow(leg[0],2)+Math.pow(leg[1],2))) {
                res="Dunkak2Triangle";
            } else {
                res="Yeahkak2Triangle";
            }
        } else {
            if(leg[2] == Math.sqrt(Math.pow(leg[0],2)+Math.pow(leg[1],2))){
                res="JikkakTriangle";
            } else if (leg[2] > Math.sqrt(Math.pow(leg[0],2)+Math.pow(leg[1],2))) {
                res="DunkakTriangle";
            } else {
                res="YeahkakTriangle";
            }
        }}else {
            res="X";
        }
        System.out.println(res);
    }
}
