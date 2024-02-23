package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class 섬연결하기 {
    public static int parent[];

    public static void main(String[] args) {
        섬연결하기 m = new 섬연결하기();
        int n = 4;
        int[][] costs = {{0,1,1}, {0,2,2}, {1,2,5}, {1,3,1}, {2,3,8}};

        System.out.println(m.solution(n, costs));
    }

    public int solution(int n, int[][] costs) {
        int answer = 0;
        parent = new int[n];
        for (int i = 0; i<n; i++) {
            parent[i] = i;
        }
        //오름차순 정렬
        Arrays.sort(costs, Comparator.comparingInt((int[] c) -> c[2]));

        int cnt = 0; //간선갯수
        for (int i = 0; i < costs.length; i++) {
            int f1 = costs[i][0];
            int f2 = costs[i][1];

            if (find(f1) != find(f2)) {
                union(f1, f2);
                answer += costs[i][2];
                cnt++;
                if (cnt == (n-1)) return answer;
            }
        }
        return answer;
    }

    public int find(int f) {
        if (parent[f] == f) return f;
        return parent[f] = find(parent[f]);
    }

    public void union(int a, int b) {
        int f1 = find(a);
        int f2 = find(b);
        if (f1 != f2) parent[f2] = f1;
    }
}
