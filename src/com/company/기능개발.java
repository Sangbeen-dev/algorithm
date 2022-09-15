package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
    public static void main(String[] args) {
        // test
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        // return {2, 1}

        Queue<Integer> queue = new LinkedList<>(); //기간
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<speeds.length; i++) {
            queue.add((int) Math.ceil((double)(100 - progresses[i]) / speeds[i])); // 기간
        }

        while (!queue.isEmpty()) {
            System.out.println("Queue =="+queue.peek());
            int nowWork = queue.poll();
            int cnt = 1;
            while (!queue.isEmpty() && nowWork >= queue.peek()) { // 같거나 작으면 같이 배포가능
                cnt++;
                System.out.println("현재 queue == "+queue.peek());
                queue.poll();
            }
            list.add(cnt);
        }

        System.out.println("list == " + list.toString());
    }
}

