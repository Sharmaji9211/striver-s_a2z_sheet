package Arrays;

import java.util.Scanner;

public class sec_smallest {
	
	static int Smallest(int arr[] ,int n) {
		int smallest = arr[0];
		for(int i =0; i<n; i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		int sec_Second=  Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]!=smallest&& arr[i]<sec_Second) {
				sec_Second= arr[i];
			}
		}
		return sec_Second;
	}
	
	public static void main(String [] args) {
		System.out.println("Enter the size of Array");
		Scanner sc =new Scanner(System.in); 
	    int n = sc.nextInt();
	    System.out.println("Enter the  Array");
		int [] arr = new int [n];
		for(int i =0 ; i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int Second =Smallest(arr,n); 
		System.out.println(Second);
	}

}
