package com.company;

import java.util.Arrays;

public class 입국심사 {
    static long answer;
    public static void main(String[] args) {
        입국심사 main = new 입국심사();
        // test
        //n = 6, times = [7, 10], return 28
        int[] times = {7, 10};

        answer = main.solution(6, times);

        System.out.println(answer);
    }

    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long left = times[0]; //최소시간 시작
//        long left = 0; //최소시간 시작
        long right = (long) times[times.length - 1] * n; // 최대시간 * 사람수 (최대)
        long mid;

        while (left <= right) {
            int completePerson = 0;
            mid = (left + right) / 2;

            for (int time : times) {
                completePerson += mid / time;
//                System.out.println("complete == "+completePerson);
            }

            if (completePerson >= n) { //시간 여유
                right = mid - 1;
                answer = mid;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }
}

