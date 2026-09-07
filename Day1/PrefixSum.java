package Day1;

import java.util.Scanner;

public class prefixsum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the element:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[] prefixsums=new int[n];
		prefixsums[0]=arr[0];
		for(int i=1;i<n;i++) {
			prefixsums[i]=prefixsums[i-1]+arr[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(prefixsums[i]+" ");
		}
		
		
	}

}
