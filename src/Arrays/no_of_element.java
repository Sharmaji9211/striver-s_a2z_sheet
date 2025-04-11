package Arrays;
import java.util.*;
public class no_of_element {
	static int countGreater(int arr[], int x) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>x) {
				count++;
			}
		}
		return count;
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
    System.out.println("Enter the elemnt");
    int x = sc.nextInt();
    int count =countGreater(arr,x);
    System.out.println("No. of element greater than "+x+" is "+count);
	}

}
