package sorting;
public class Bubble_Sort1 {

	 static void bubblesort(int arr[]) {
		 int n= arr.length;
		 for(int i=0; i<n-1; i++) {
			 for(int j=0; j<n-i-1; j++) {
				 if(arr[j]>arr[j+1]) {
					 int item = arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=item;
				 }
			 }
		 }
		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {7,8,3,4,5,1};
       bubblesort(arr);
       for(int i :arr) {
    	   System.out.print(i +
    			   " ");
       }
	}

}
