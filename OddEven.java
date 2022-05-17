/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to accept a number from the user
                and check whether the number is Even or odd.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEven {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n;

        System.out.print("Enter a number : ");
        n = Integer.parseInt(in.readLine());

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
