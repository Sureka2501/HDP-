package Day1;
import java.util.*;
public class appleproblem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the gate having:");
		int g=sc.nextInt();
		System.out.print("Apple in the hande is");
		int a=sc.nextInt();
		for(int i=0;i<g;i++) {
			a=(a+1)*2;
		}
		System.out.print(a);
	}

}

