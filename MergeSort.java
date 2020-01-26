import java.util.*;
class MergeSort
{
 public static void main(String args[])
 { 
  Scanner s=new Scanner(System.in);
  int a[]=new int[10];
  System.out.println("enter the value of n");
  int n;
  n=s.nextInt();
  System.out.println("enter the array elments");
  for(int i=0;i<n;i++)
	  a[i]=s.nextInt();
  System.out.println("elemensts before sorting");
  print(a,n);
  MergeSort m=new MergeSort();
  m.sort(a,0,n-1);
  System.out.println("elements after sorting");
  print(a,n);
 }
 static void print(int a[],int n)
 {
	 for(int i=0;i<n;i++)
		System.out.println(a[i]);
 }
 void sort(int a[],int l,int h)
 {
	 if(l<=h)
	 {
		 int m=(h-l)/2;
		 sort(a,l,m);
		 sort(a,m+1,h);
		 merge(a,l,m,h);
	 }
 }
 void merge(int a[],int l,int m,int h)
 {
	 int i=l,j=m+1,k=l;
	 int b[]=new int[10];
	 while(i<=m&&j<=h)
	 {
		 if(a[i]<=a[j])
		 {
			 b[k]=a[i];
			 i++;
		 }
		 else
		 {
			 b[k]=a[j];
			 j++;
		 }
		 k++;
	 }
	 while(i<=m)
		 b[k++]=a[i++];
	 while(j<=h)
		 b[k++]=a[j++];
	 for(i=l;i<=h;i++)
	     a[i]=b[i];
  }
}
		  
	 
