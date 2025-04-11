package Arrays;

import java.util.Scanner;

public class frequency_element {

	static void freq_ele(int arr[],int n) {
		for(int i =0 ; i<n ; i++) {
			int flag  =0;
			int count =0;
			for(int j=i+1; j<n;j++) {
				if(arr[i]==arr[j]) {
					flag=1;
					break;
				}
			}
			if (flag==1)
			   continue;
		for(int j = 0;j<=i;j++) {
			if(arr[i]==arr[j]) {
				count ++;
			}
		}
		System.out.println( arr[i]+" : "+count);
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
		    freq_ele(arr ,n );
	}

}
