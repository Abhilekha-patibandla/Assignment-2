package Assignment_2;
import java.util.*;
public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter col size for the row:"+i+" ");
			int col=sc.nextInt();
			arr[i]=new int[col];
			System.out.println("Enter elements:");
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();	
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
