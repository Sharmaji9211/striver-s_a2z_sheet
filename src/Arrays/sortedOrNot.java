package Arrays;

import java.util.Scanner;

public class sortedOrNot {
     
	static boolean sorted(int arr[]) {
		boolean check = true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[i+1]) {
				check=false;
				break;
			}
		}
		return check;
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
		   boolean check=  sorted(arr);
		   System.out.println(check);
	}

}
