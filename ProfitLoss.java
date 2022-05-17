/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to take cost price and sell price as input from the user
                and print profit & profit percent or loss & loss percent accordingly.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProfitLoss {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        float cp, sp, loss, lossper, profit, profitper;

        System.out.print("Enter cost price : ");
        cp = Float.parseFloat(in.readLine());
        System.out.print("Enter sell price : ");
        sp = Float.parseFloat(in.readLine());

        if (sp == cp)
            System.out.println("Neither loss nor profit !");

        else if (sp > cp) {
            profit = sp - cp;
            profitper = profit / cp * 100;
            System.out.println("Profit = " + profit);
            System.out.println("Profit Percent = " + profitper);
        } else {
            loss = cp - sp;
            lossper = loss / cp * 100;
            System.out.println("Loss = " + loss);
            System.out.println("Loss Percent = " + lossper);
        }
    }
}
