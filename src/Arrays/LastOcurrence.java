package Arrays;
import java.util.*;
public class LastOcurrence {
      
	static int lastOcurrence(int arr[],int element) {
		int last =-1;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==element) {
				last =i;
			}
		}
		return last;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc =  new Scanner(System.in);
     System.out.println("enter the Size of Array");
     int n= sc.nextInt();
     int arr[] = new int [n];
     System.out.print("Enter the Arrays");
     for(int i=0;i<n;i++){
    	 arr[i]=sc.nextInt();  
    	 }
     System.out.println("Enter the Key");
     int x =sc.nextInt();
     int last =lastOcurrence(arr,x);
     System.out.println("last = "+last );
	}

}
