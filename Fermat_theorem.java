import java.util.*;
import java.io.*;

public class Fermat_theorem
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int m = sc.nextInt();
    
    modInverse(a, m);
  }
  
  public static void modInverse(int a, int m)
  {
    if(gcd(a, m) != 1) 
       System.out.println("Inverse doesn't exist");
    else
       System.out.println("Modular multiplicative inverse is " + power(a, m-2, m));
  }
  
  public static int power(int x, int y, int m)
  {
    if( y == 0)
      return 1;
    int p = power(x, y/2, m) % m;
    p = ( p*p ) % m;
    
    return ( y % 2 == 0) ? p : (x*p) % m;
  }
  
  public static int gcd(int a, int b)
  {
    if ( b == 0)
      return a;
    else
      return gcd(b, a%b);
  }
}

