// Shariza Aziz
// 12/14/25
// Write a program that calculates a cell phone bill with:
//    $0.10 per minute for first 100 minutes
//    $0.08 per minute for 101-300 minutes
//    $0.05 per minute for any minutes over 300

import java.util.*;
public class CellPhoneBill
{
   public static final double FLAT_FEE = 30.00;
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      
      System.out.print("Enter number of minutes used: ");
      int minutes = console.nextInt();
      
      double totalBill = calcBill(minutes);
      System.out.println("The cell phone bill cost $" + totalBill);
   }
   
   public static double calcBill(int mins)
   {
      double total = FLAT_FEE;
      
      if(mins <= 100)
      {
         total += (mins * 0.10);
      }
      else if(mins >= 101 && mins <= 300)
      {
         total += (100 * 0.10);
         total += ((mins - 100) * 0.08);
      }
      else
      {
         total += (100 * 0.10);
         total += ((300 - 100) * 0.08);
         total += ((mins - 300) * 0.05);
      }
      
      return total;
    }

}