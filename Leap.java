/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to accept a Year from the user
                and check whether the Year is Lear Year or not.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leap {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int year;

        System.out.print("Enter a year : ");
        year = Integer.parseInt(in.readLine());

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " is Leap Year");
        else
            System.out.println(year + " is not a Leap Year");

    }
}
