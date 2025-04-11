package Arrays;
import java.util.*;
public class Elementocurrence {

	static int Ocuurence(int arr[],int x) {
		int count =0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==x) {
				count ++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the size of Arrays");
    int n = sc.nextInt();
    int arr[]= new int [n];
    for(int i=0; i<n;i++) {
    	arr[i]=sc.nextInt();
    }
    System.out.println("Enter the Element");
    int x= sc.nextInt();
    int count=  Ocuurence(arr,x);
    System.out.println("Count = "+count);
	}

}
