/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to accept a number from the user and
                check whether the number is Positive,Negative or Non-negative.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PosNeg {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        float n;

        System.out.print("Enter a number : ");
        n = Float.parseFloat(in.readLine());

        if (n > 0)
            System.out.println("Positive Number");
        else if (n < 0)
            System.out.println("Negative number");
        else
            System.out.println("Non-negative number");

    }
}
