package module1.java.basics;

public class Fibonacci_number {
	
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		java.util.Scanner sc =new java.util.Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fib(n));
	}
	public static int fib(int n){
		if(n==1|n==2){
			return 1;
		}
       else{
		     
		     return (fib(n-1)+fib(n-2));
	         
	   }
	}
	
	
}



