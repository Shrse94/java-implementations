// Shariza Aziz
// 11/23/26
// Quadratic.java
// Quadratic formula with return from method

public class Quadratic
{
   public static void main(String[] args)
   {  
      // Declare x1 and x2 to be doubles to store the result1 and result2 
      // from the addRoot and subRoot methods
      double x1, x2;
      
      // Initialization of 3 parameters
      int a = -3, b = 7, c = 6;
      
      // call addRoot method and store the return value in x1
      x1 = addRoot(a, b, c);
      System.out.println("The root using addition is: " + x1);
      
      // call subRoot method and store the return value in x2
      x2 = subRoot(a, b, c);
      System.out.println("The root using subtraction is: " + x2);
   }
   
   // Method calculates the root using addition and is done without the Math.pow function
   public static double addRoot(int a, int b, int c)
   {
      double result1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
      return result1;
   }
   
   // Method calculates the root using subtraction and is done with the Math.pow function
   public static double subRoot(int a, int b, int c)
   {
      double result2 = (-b - (Math.sqrt(Math.pow(b,2) - 4 * a * c))) / (2 * a);
      return result2;
   }
   
}