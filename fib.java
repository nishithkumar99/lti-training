import java.util.*;
class fib{  
public static void main(String args[])  
{    
 int n,m,i=0,f;
 int a[]= {1,2,3,4,5,6};
 n=a.length;
 Scanner sc= new Scanner(System.in);
 int target=sc.nextInt();
 
 m=(i+n)/2;
 for(i=0;i<n;i++)
 {
	 
	 if(a[i]<target)
	 {
		 i=m;
		 m=(i+n)/2;
	 }
	 else if(a[i]>target)
	 {
		 n=m;
		 m=(i+n)/2;
	 }
	 else if(a[i]==target)
	 {
		 System.out.print("found");
	 return ;
	 }
 
	 else
	 {
		 System.out.print("Not found");
	 return;
	 }
 }
  
}}  