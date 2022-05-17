/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to accept a number from the user and
                check whether the number is one digit,two digit or three digit.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Digit {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int n;

        System.out.print("Enter a number :");
        n = Integer.parseInt(in.readLine());

        if (n / 10 == 0)
            System.out.println(n + " is One digit number");
        else if (n / 100 == 0)
            System.out.println(n + " is Two digit number");
        else if (n / 1000 == 0)
            System.out.println(n + " is Three digit number");
        else
            System.out.println("Number is having more than three digit");

    }
}
