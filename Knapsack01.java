import java.util.*;
import java.lang.*;
import java.io.*;

class Knapsack01 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int[] val=new int[n];
		    int[] wgt=new int[n];
		    int w=sc.nextInt();
		    for(int i=0;i<n;i++)
		       val[i]=sc.nextInt();
		    for(int i=0;i<n;i++)
		       wgt[i]=sc.nextInt();
		   for(int i=0;i<n-1;i++)   //sorting weights wrt values
		   {
		       for(int j=i+1;j<n;j++)
		       {
		           if(wgt[i]>wgt[j])
		           {
		               int temp=val[i];
		               val[i]=val[j];
		               val[j]=temp;
		               
		               temp= wgt[i];
		               wgt[i]=wgt[j];
		               wgt[j]=temp;
		           }
		       }
		   }
		   int[][] r=new int[n+1][w+1];
		   for(int i=0;i<n+1;i++)
		   {
		       for(int j=0;j<w+1;j++)
		       {
		           if((i==0)||(j==0))
		            r[i][j]=0;
		           else if(wgt[i-1]>j)
		            r[i][j]=r[i-1][j];
		           else
		           {
		               int x=val[i-1]+r[i-1][j-wgt[i-1]];
		               r[i][j]=Math.max(x,r[i-1][j]);
		           }
		       }
		   }
		   int res=r[n][w];
		   System.out.println(res);
	}
}