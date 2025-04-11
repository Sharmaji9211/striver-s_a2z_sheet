package Arrays;

import java.util.Scanner;

public class f_AseS_Dec {
    static void sorted(int arr[]) {
    	
    	int n = arr.length;
    	int temp;
   for(int j=0;j<n-1;j++) {
	 	for(int i= 0;i<n/2; i++) {
    		if(arr[i]>arr[i+1]) {
    			temp= arr[i];
    			arr[i]=arr[i+1];
    			arr[i+1]=temp;
    		}
    	}
    	for(int i= n/2;i<n-1; i++) {
    		if(arr[i]<arr[i+1]) {
    			temp= arr[i];
    			arr[i]=arr[i+1];
    			arr[i+1]=temp;
    		}
    	}
   }
    	for(int i= 0;i< n;i++) {
    		System.out.println(arr[i]+" ");
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the  size of the Arrays ");
    int n = sc.nextInt();
    int [] arr = new int [n];
    System.out.println("Enter the Arrays ");
    for(int i=0;i< n ; i++) {
    	arr[i]=sc.nextInt();
    	}
     sorted(arr);
	}

}
