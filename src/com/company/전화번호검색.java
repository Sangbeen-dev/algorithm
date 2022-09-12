package com.company;

import java.util.Arrays;

public class 전화번호검색 {
    static boolean answer = true;
    public static void main(String[] args) {
        전화번호검색 main = new 전화번호검색();
        // test
//        String[] phone_book = {"119", "97674223", "1195524421"}; // false
        String[] phone_book = {"123","456","789"}; // true
        answer = main.solution(phone_book);

        System.out.println(answer);
    }

    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for(int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) return false;
        }

        return answer;
    }
}

