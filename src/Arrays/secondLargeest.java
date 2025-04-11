package Arrays;

import java.util.Scanner;

public class secondLargeest {
	static int findMax(int arr[]) {
		int mx = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>mx) {
				mx=arr[i];
			}
		}
		return mx;
		
	}
	static int findSecondMax(int [] arr) {
		int mx = findMax(arr);
		for(int  i=0;i< arr.length;i++) {
			if(arr[i]==mx) {
				arr[i]=Integer.MIN_VALUE;
			}
		}
		int SecondMax=findMax(arr);
		return SecondMax;
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
	    
	    int Max=findSecondMax(arr);
	    System.out.println("Scond largest no is "+Max);
	}

}
