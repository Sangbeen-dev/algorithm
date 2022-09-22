package com.company;


public class 숫자의표현 {
    static int answer = 0;
    public static void main(String[] args) {
        숫자의표현 main = new 숫자의표현();
        // test
        int n = 15; //4
        answer = main.solution(n);

        System.out.println(answer);
    }

    public int solution(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }

        return answer;
    }
}

