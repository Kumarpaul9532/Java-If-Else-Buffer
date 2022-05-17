/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to accept a three numbers from the user and
                Print the second largest/second smallest number (Using Coditonal Operator).
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondLargest {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        float a, b, c, sl;

        System.out.print("Enter three numbers : ");
        a = Float.parseFloat(in.readLine());
        b = Float.parseFloat(in.readLine());
        c = Float.parseFloat(in.readLine());

        sl = (a > b && a > c) ? ((b > c) ? b : c) : (a < b && a < c) ? ((b < c) ? b : c) : a;
        System.out.println("Second largest number is " + sl);
    }
}
