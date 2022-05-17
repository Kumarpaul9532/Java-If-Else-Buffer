/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to accept three numbers from the user
                and print the largest number among them.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Largest {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        float a, b, c;

        System.out.print("Enter three numbers : ");
        a = Float.parseFloat(in.readLine());
        b = Float.parseFloat(in.readLine());
        c = Float.parseFloat(in.readLine());

        if (a > b && a > c)
            System.out.println(a + " is largest");
        else if (b > c)
            System.out.println(b + " is largest");
        else
            System.out.println(c + " is largest");

    }
}
