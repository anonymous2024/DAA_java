import java.util.*;
import java.io.*;

public class Lucas_Theorem
{
  public static void main ( String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    int p = sc.nextInt();
    
    System.out.println("Valse of nCr % p  is " + nCrMod(n, r, p));
  }
  
  public static int nCrMod(int n, int r, int p)
  {
    if ( r==0)
      return 1;
    
    int ni = n%p;
    int ri = r%p;
    
    return (nCrMod(n/p, r/p, p)* nCrModDp(ni, ri, p)) %p;
  }
  
  public static int nCrModDp( int n, int r, int p)
  {
    int [] C = new int [r+1];
    C[0] = 1;
    for(int i = 1; i <= n; i++)
    {
      for ( int j = Math.min( i , r); j > 0; j--)
        C[j] = (C[j] + C[j-1]) % p;
    }
    return C[r];
  }
}
      
   
  
   
