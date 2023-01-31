
import java.util.Scanner;
import java.text.*;

public class Driver {
    public static void main(String[] args) {
        // Scanner object to receive user input -- object reference scan
        Scanner scan = new Scanner(System.in);
        //Prompt letting user input buying price
        System.out.println("Enter your buying price per share:");
        //value from scanned object -- nextDouble because the price can have decimal
        double buyingPrice = scan.nextDouble();
        int day = 1;
        double closingPrice=0.01;
        DecimalFormat df = new DecimalFormat("0.00");
        //Creates loop
        while(true) {
            System.out.println("Enter the closing price for the day "
                    + day + " (any negative value left):");
            closingPrice= scan.nextDouble();
            if (closingPrice < 0.0) break;
            double earnings = closingPrice - buyingPrice;
            if (earnings > 0.0) {
                System.out.println("After day " + day + ", you earned " 
                        + df.format(earnings) + " per share.");
            }
            else if (earnings < 0.0) {
                System.out.println("After day " + day + ", you lost " 
                + df.format(-earnings) + " per share.");
            }
            else {
                System.out.println( "After day " + day + ", you have" +
                        "no earnings per share.");
            } 
            day += 1;
        }
scan.close();


    }
}