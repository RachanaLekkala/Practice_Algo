import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++)
		       arr[i]=sc.nextInt();
		    int res = 0; 
		    int[] l=new int[n];
		    int[] r=new int[n];
		    l[0]=arr[0];
		    for (int i=1;i<n;i++) //left array
                l[i] = Math.max(l[i-1], arr[i]); 
            r[n-1] = arr[n-1]; 
            for (int i=n-2;i>=0;i--) //right array
                r[i] = Math.max(r[i+1], arr[i]); 
            for (int i=0;i<n;i++) 
            { 
                res+=Math.min(l[i],r[i])-arr[i];
            }
             System.out.println(res);
	}
}