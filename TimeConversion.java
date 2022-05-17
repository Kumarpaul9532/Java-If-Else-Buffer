/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to take Time in seconds as input from the user
                and convert in into Hours, Minutes and Seconds.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeConversion {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int sec, hr = 0, min = 0;

        System.out.printf("Enter the Time is seconds : ");
        sec = Integer.parseInt(in.readLine());

        min = sec / 60;
        sec = sec % 60;
        if (min >= 60) {
            hr = min / 60;
            min = min % 60;
        }
        System.out.print(hr + " Hours ");
        System.out.print(min + " Minutes ");
        System.out.println(sec + " Seconds");

    }
}
