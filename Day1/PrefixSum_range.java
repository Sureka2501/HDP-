package Day1;

import java.util.Scanner;

public class prefixrange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the element:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[] prefixsums=new int[n+1];
		for(int i=1;i<n;i++) {
			prefixsums[i+1]=prefixsums[i]+arr[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(prefixsums[i]+" ");
		}
		for(int i=0;i<n;i++) {
			System.out.print(prefixsums[i++]);
		}
		int l=sc.nextInt();
		int r=sc.nextInt();
		int res=prefixsums[r+1]-prefixsums[l];
		System.out.print(res+" ");
				
		
		
	}

}
