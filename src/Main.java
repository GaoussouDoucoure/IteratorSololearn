/*
PRACTICE EXERCISE Iterators

The program you are given declares a LinkedList of integers, takes 5 numbers from user, and add them to it.
Write a program to calculate and output the sum of them elements.

Sample Input
4
3
50
3
8

Sample Output
68

Use Iterator and its methods to execute the calculation using the while loop.
*/

import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> nums = new LinkedList<Integer>();

        while(nums.size()<5){
            int num = scanner.nextInt();
            nums.add(num);
        }


        int sum = 0;

        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()){
            int value = it.next();
            sum += value;
        }

        /* this would also work by replacing line 38-42
        for (int value : nums) {
            sum += value;
        }
         */

        System.out.println(sum);
    }
}
