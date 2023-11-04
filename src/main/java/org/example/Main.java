package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter string: ");
        Scanner scan = new Scanner(System.in);
        char[] strChar = scan.nextLine().toCharArray();
        System.out.println("String contained " + count(strChar) + " groups of 'AGA' and 'OGO'");
        System.out.println("Modified string (param):  " + (new String(strChar)));
        char[] finalResult = replaceOGOandAGA(strChar);
        System.out.println("Modified string (result): " + (new String(finalResult)));
    }

    public static int count(char[] str) {
        int k = 0;
        for (int i = 0; i < str.length - 2; i++) {
            if ((str[i] == 'O' && str[i + 1] == 'G' && str[i + 2] == 'O') ||
                    (str[i] == 'A' && str[i + 1] == 'G' && str[i + 2] == 'A')) {
                k++;
            }
        }
        return k;
    }

    public static char[] replaceOGOandAGA(char[] str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length; i++){
            if (i < str.length - 2 && ((str[i] == 'O' && str[i + 1] == 'G' && str[i + 2] == 'O') ||
                    (str[i] == 'A' && str[i + 1] == 'G' && str[i + 2] == 'A'))) {
                sb.append("**");
                i += 2;
            } else {
                sb.append(str[i]);
            }
        }
        return sb.toString().toCharArray();
    }
}
