package com.allen_anker.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APlusBFormat {
    /**
     * Calculate a+b and output the sum in standard format -- that is,
     * the digits must be separated into groups of three by commas (unless there are less than four digits).
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] numsStr = bufferedReader.readLine().split(" ");
        bufferedReader.close();

        int num1 = Integer.parseInt(numsStr[0]), num2 = Integer.parseInt(numsStr[1]);
        char[] chars = String.valueOf(num1 + num2).toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int length = chars.length;
        for (int i = length - 1; i >= 0; i--, count++) {
            if (count == 3 && chars[i] != '-') {
                sb.append(',');
                count = 0;
            }
            sb.append(chars[i]);
        }

        System.out.println(sb.reverse().toString());
    }
}
