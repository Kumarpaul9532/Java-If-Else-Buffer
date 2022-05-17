/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to take five numbers as input from the user
                and print smallest of them.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestOf5 {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        float a, b, c, d, e;

        System.out.print("Enter five numbers : ");
        a = Float.parseFloat(in.readLine());
        b = Float.parseFloat(in.readLine());
        c = Float.parseFloat(in.readLine());
        d = Float.parseFloat(in.readLine());
        e = Float.parseFloat(in.readLine());

        if (a < b && a < c && a < d && a < e)
            System.out.println(a + " is smallest");
        else if (b < c && b < d && b < e)
            System.out.println(b + " is smallest");
        else if (c < d && c < e)
            System.out.println(c + " is smallest");
        else if (d < e)
            System.out.println(d + " is smallest");
        else
            System.out.println(e + " is smallest");

    }
}
