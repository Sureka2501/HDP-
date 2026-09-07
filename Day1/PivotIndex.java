package Day1;
import java.util.Scanner;
public class pivotindex {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no.of Element:");
		int n=sc.nextInt();
		//Array initialization
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
		}
		int total=0;
		for(int i=0;i<arr.length;i++) {
			total=total+arr[i];
		}
		
		//Pivot Index
		int left=0;
		for(int i=0;i<arr.length;i++) {
			int right=total-left-arr[i];
			
			if (left==right){
				System.out.print("Pivot Index = "+ i);
				return;
				
			}
			left=left+arr[i];	
		}
		System.out.println("No Pivot Index");	
	}

}
