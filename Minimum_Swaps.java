import java.util.Scanner;
import java.io.*;

public class Minimum_Swaps //Solution
{
  static int minimumSwaps(int [] arr)
  {
    int min = 0;
    int min_num =0;
    int num = arr[0];
    int count =0;
    for(int i = 0; i< arr.length; i++)
    {
       min = arr[0];
      for (int j = 1; j < arr.length; j++)
      {
        if( arr[j] < min)
          min_num = j;
      }
      if( min_num != 0)
      {
         count++;
         swap(arr,0, min_num);
      }
    }
    for(int i = 0; i< arr.length; i++)
    {
      System.out.println(arr[i]);
    }
    return count;
    
  }
  
  static void swap(int [] arr, int a, int b)
  {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }     
  
  public static void main (String [] args) throws IOException
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr [] = new int [n];
    for ( int i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
    }
    int swaps = minimumSwaps(arr);
    System.out.println(swaps);
  }
}
