import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   while(t>0)
	   {
	    int l=sc.nextInt(); //no.of denominations
	    int c[]=new int[l]; //array of denominations
	    for(int i=0;i<l;i++)
	      c[i]=sc.nextInt();
	    int n=sc.nextInt(); //total amount
        int arr[][]=new int[l][n+1];
        for(int i=0;i<l;i++)
        {
           for(int j=0;j<=n;j++)
           {
               if(i==0)  //least denomination
               {
                   if(j%c[i]==0)
                      arr[i][j]=1;
                   else
                     arr[i][j]=0;
               }
               else
               {
                   if(c[i]>j)  //if amount is less than denomination
                   {
                       arr[i][j]=arr[i-1][j];
                   }
                   else
                   {
                       int exc=arr[i-1][j]; //exclude the denomination
                       int inc=arr[i][j-c[i]];  //include the denomination
                       arr[i][j]=exc+inc;  //add both
                   }
               }
           }
        }
        int res=arr[l-1][n];
        System.out.println(res);
        t--;
	   }
	}
}