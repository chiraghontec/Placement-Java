//Given an array arr[] of n integers where arr[i] represents the number of chocolates in ith packet. Each packet can have a variable number of chocolates. there are M students, the task is to distribute chocolate packets such that: Each student gets exactly one packet given to the student is minimized.

import java.util.Arrays;
import java.util.Scanner;

public class chocolate {
    private static int i;
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter number of packets");
        int n = key.nextInt();

        int packets[] = new int[n];
        System.out.println("Enter the chocolates:");
        for(int i = 0; i < packets.length; i++){
            packets[i] = key.nextInt();
        }
        System.out.println(Arrays.toString(packets));

        System.out.println("Enter number of students:");
        int m = key.nextInt();

        Arrays.sort(packets);

        System.out.println(packets[m-1] - packets[0]);
    }
}
