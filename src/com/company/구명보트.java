package com.company;

import java.util.Arrays;

public class 구명보트 {
    public static void main(String[] args) {
        구명보트 m = new 구명보트();
        // input
        // {70, 50, 80, 50}, {70, 80, 50}
        int[] people = {70, 50, 80, 50};
        int limit = 100;

        System.out.println(m.solution(people, limit));
    }

    public int solution (int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int idx = 0;
        for (int i = people.length - 1; i >=idx; i--) {
            if (people[i] + people[idx] <= limit) {
                answer++;
                idx++;
            } else {
                answer++;
            }
        }
        return answer;
    }
}
