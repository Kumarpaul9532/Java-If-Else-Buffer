/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to accept a Year from the user and check whether
                the Year is Lear Year, Century Leap Year, Century Year or not.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cleap {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int year;

        System.out.print("Enter a year : ");
        year = Integer.parseInt(in.readLine());

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            if (year % 100 == 0)
                System.out.println(year + " is Century Leap Year");
            else
                System.out.println(year + " is Leap Year");
        }

        else if (year % 100 == 0)
            System.out.println(year + " is a Century Year");

        else
            System.out.println(year + " is a Normal year");
    }
}
