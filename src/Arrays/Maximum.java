package Arrays;
import java.util.*;
public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of the Arrays");
    int n= sc.nextInt();
    int arr []= new int[n];
    for(int i=0; i<n ; i++) {
     arr[i]=sc.nextInt();
	}
    int ans =0;
    for(int j=0;j<n;j++) {
    	if(arr[j] > ans) {
    		ans = arr[j];
    	}
    }
    System.out.print(ans);
}
}
