package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3226 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;    //요금
        for(int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String time = st.nextToken();
            int DD = Integer.parseInt(st.nextToken());
            String[] arr = time.split(":"); // arr[0] = 시, arr[1] = 분
            int startHour = Integer.parseInt(arr[0]); //통화시작 시간
            int startMin = Integer.parseInt(arr[1]); // 통화시작 분
            int endHour = startHour;    //통화 종료 시간
            int endMin = startMin + DD; // 통화 종료 분
            // 60분이 넘었을 때
            if (endMin >= 60) {
                endMin -= 60;
                endHour += 1;
            }
            //24시간이 넘었을때
            if(endHour >= 24){
                endHour -= 24;
            }
            //07~18시 이내 통화
            if ((7 <= startHour && startHour <= 18) && (7 <= endHour && endHour <= 18)) {
                sum += DD * 10;
            }
            //00~06  19~23시59분 통화
            else if (((0 <= startHour && startHour <= 6) || (19 <= startHour && startHour <= 23)) && ((0 <= endHour && endHour <= 6) || (19 <= endHour && endHour <= 23))) {
                sum += DD * 5;
            }
            //전화중 요금이 바뀌는 시간이 껴잇는 경우
            else if (startHour == 18 && endHour == 19) {
                sum += 10 * (60 - startMin) + 5 * endMin;
            }
            else if (startHour == 6 && endHour == 7) {
                sum += 5 * (60 - startMin) + 10 * endMin;
            }
        }
        System.out.println(sum);

    }
}


