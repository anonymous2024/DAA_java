import java.util.*;
import java.io.*;

public class Euler_Totient
{
  public static void main ( String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0; i< n; i++)
      System.out.println("phi(" + n + ") = " + phi(i));
  }
  
  public static int phi(int n)
  {
    int result = n;
    for ( int i = 2; i*i <= n; ++i)
    {
      if( n % i == 0)
      {
        while( n % i == 0)
          n /= i;
        result -= result / i;
      }
    }
    if ( n > 1)
      result -= result / n;
    return result;
  }
}

  
   
       
    
