import java.util.*;
import java.io.*;
import java.lang.*;

public class Activity_Selection
{
  public static void main (String [] args)
  {
    //input string
    
    int s[] = { 1, 3, 0 , 5, 8, 5};
    int f[] = { 2, 4, 6, 7, 9, 9};
    int n = s.length;
    
    primeMaxActivities(s, f, n);
    
  }
  
  public static void primeMaxActivities( int s[], int f[], int n)
  {
    int i, j;
    System.out.println("Following activities are selected : n");
    
    i = 0;
    System.out.print( i + " ");
    
    //consider rest of the activities
    for(j = 1; j< n; j++)
    {
      // if this activity has start time grater than or equal to the finish time of previously selected activity, then select it
      if ( s[j] >= f[i])
      {
        System.out.print(j + " ");
        i = j;
      }
    }
  }
}
      
      
    
  
  
    
