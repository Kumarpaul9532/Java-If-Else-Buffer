/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to accept a number from the user
                and check whether the number is Buzz number or not.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buzz {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int n;

        System.out.print("Enter a number : ");
        n = Integer.parseInt(in.readLine());

        if (n % 7 == 0 || n % 10 == 7)
            System.out.println("Buzz Number");
        else
            System.out.println("Not a Buzz Number");

    }
}
