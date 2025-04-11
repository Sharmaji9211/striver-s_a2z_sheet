package Arrays;

import java.util.Scanner;

public class reverseAnArray {
	static void Swap_array(int arr[],int i, int j) {
		int temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void reverseArray(int arr[]) {
		int i =0; int j=arr.length-1;
		while(i<j) {
			Swap_array(arr,i,j);
			i++;
			j++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    System.out.print("Enter the size ");
		    int n = sc.nextInt();
		    int arr [] = new int [n];
		    System.out.print("Enter the Array");
		    for(int i=0;i<n;i++) {
		    	arr[i]=sc.nextInt();
		     }
		    reverseArray(arr);
	}

}
