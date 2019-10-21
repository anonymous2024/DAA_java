import java.io.*;
import java.util.*;
import java.math.*;

public class Miller_Rabin {
  
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    
    for (int i = 1; i < n; i++)
      if (isPrime (i, k))
         System.out.println(i + " ");
  }
  
  public static boolean isPrime(int n, int k)
  {
    if ( n <= 1 || n == 4)
      return false;
    if ( n <= 3)
      return true;
    
    // find r such taht n = 2^d * r + 1
    // for some r>= 1
    
    int d = n-1;
    
    while (d % 2 == 0)
      d /= 2;
    
    // iterate k times
    for (int i = 0; i < k; i++)
      if (!millerTest(d,n))
        return false;
    return true;
  }
  
  public static boolean millerTest(int d, int n)
  {
    int a = 2 + (int)(Math.random() % (n - 4));
    
    //compute a^d % n
    int x = power(a, d, n);
    if ( x == 1 || x == n - 1)
      return true;
    
    //keep squaring x while one of the following doesn't happen
    // d does not reach n-1
    // (x^2) % n is not 1
    // (x^2) % n is not n-1
    while ( d != n - 1) 
    {
      x = ( x*x ) % n;
      d *= 2;
      if ( x == 1)
        return false;
      if ( x == n - 1)
        return true;
    }
    // return composite
    return false;
  }
  
  public static int power(int x, int y, int p)
  {
    int res =1;
    x = x % p;
    
    while ( y > 0)
    {
      if (( y & 1 ) == 1)
        res = ( res * x) % p;
      y = y >> 1; 
      x = ( x * x ) % p;
    }
    return res;
  }
  
}
    
    
