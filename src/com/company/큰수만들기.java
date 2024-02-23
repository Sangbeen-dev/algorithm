package com.company;

public class 큰수만들기 {

    public static void main(String[] args) {
	// write your code here
        큰수만들기 m = new 큰수만들기();
        //input
        //number "1231234" , "1924", "4177252841"
        String number = "1231234";
        // k 3, 2, 4
        int k = 3;

        System.out.println(m.solution(number, k));

    }
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int len = number.length() - k;
        for (int i = 0; i < len; i++) {
            System.out.println("i == " + i);
            int max = 0;
            for (int j = idx; j <= i + k; j++) {
                System.out.println("j == " + j);
                int current = number.charAt(j) - '0';
                if (max < current) {
                    max = current;
                    idx = j + 1;
                    System.out.println("if -> max == " + max);
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}
