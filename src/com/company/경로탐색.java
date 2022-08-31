package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 경로탐색 {
    static boolean[] check;
    static ArrayList<String> allRoute = new ArrayList<>();

    public static void main(String[] args) {
        경로탐색 main = new 경로탐색();
        String[] answer = {};
        int cnt = 0;
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        check = new boolean[tickets.length]; // 경로체크할거

        main.dfs("ICN", "ICN", tickets, cnt);
        Collections.sort(allRoute);

        answer = allRoute.get(0).split(" ");

        Arrays.stream(answer).forEach(s -> System.out.println(s + " "));

    }
    public void dfs (String start, String route, String[][]tickets,int cnt) {
//        System.out.println(tickets.length);
//        System.out.println("cnt==" + cnt);
        if (cnt == tickets.length) { //cnt 랑 같으면 경로 다 돈거
//            System.out.println("check== "+route);
            allRoute.add(route);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!check[i] && start.equals(tickets[i][0])) { // 출발지랑 방문한 곳인지 체크
                check[i] = true;
                dfs(tickets[i][1], route + " " + tickets[i][1], tickets, cnt+1);
                check[i] = false;
            }
        }
    }
}

