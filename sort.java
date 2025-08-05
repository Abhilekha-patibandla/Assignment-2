package Assignment_2;
import java.util.*;
public class sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        String[] str=new String[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of the string array:");
        for(int i=0;i<arr.length;i++) {
        	str[i]=sc.next();
        }
        Arrays.sort(arr);
        Arrays.sort(str);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(str));
	}

}
