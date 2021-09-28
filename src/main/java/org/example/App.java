/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Koby Montenegro
 */

package Exercise28;

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int num = 0;
        for (int i = 0; i <= 4 ; i++)
        {
            System.out.print("Enter a number: ");
            num = scan.nextInt();
            total = total + num;
        }
        System.out.println("The total is " + total + ".");
        scan.close();
    }
}