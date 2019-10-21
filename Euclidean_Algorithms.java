import java.util.Scanner;
import java.io.*;

public class Euclidean_Algorithms
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     int num1 = sc.nextInt();
     int num2 = sc.nextInt();
     
     int gcd = calculate(num1, num2);
     System.out.println(gcd + "****");
     System.out.println(x + "****" + y);
   }
   public static int x = 0;
   public static int y = 0;
   
   public static int calculate(int num1, int num2)
   {
      return gcd(num1, num2, x, y);
   }
   public static int gcd(int num1, int num2, int )
   {
     int high, low,gcd;
     if(num1>num2)
     {
      low = num2;
      high = num1;
     }
     else
     {
      low = num1;
      high = num2;
     }
     if(low == 0)
     {
        return high;
     }
     System.out.println(x + "***" + y + "***" + low + "****" + high + "****");
     x = y - (high/low)*x;
     y = x;
     return gcd(high % low, low);
    }
}
   
      
       
     
     
     
     
     
     
     
