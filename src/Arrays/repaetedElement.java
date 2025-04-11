package Arrays;
import java.util.*;
import java.util.Arrays;
public class repaetedElement {
	static void RepeatedElement(int arr[] , int n) {
		 Map<Integer ,Integer > mp= new HashMap <>();
		 for(int i =0 ; i< n ; i++) {
			 if(mp.containsKey(arr[i])) {
				 mp.put(arr[i], mp.get(arr[i]+1));
			 }
			 else {
				 mp.put(arr[i], 1);
			 }
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
	    RepeatedElement(arr, n);
	}

}
