import java.util.*;
import java.io.*;

public class Sieve_Eratosthenes
{
   
   public static void main(String [] args)
   {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      find(n);
   }
   
   public static void find(int n)
   {
      boolean [] prime = new boolean[n+1];
      for ( int  i = 0; i<n ; i++)
        prime[i] = true;
        
      for(int p = 2; p*p <= n; p++)
      {
         if(prime[p] == true)
         {
            for(int i = p*p; i<= n; i +=p)
              prime[i] = false;
         }
      }
      
      print(prime);
   }
   
   public static void print(boolean [] prime) 
   {     
      for(int i = 2; i < prime.length; i++)
      {
         if(prime[i] == true)
           System.out.print(i + " ");
      }
   }
    
}
     
