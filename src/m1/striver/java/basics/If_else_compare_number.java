package m1.striver.java.basics;
	import java.io.*;
	import java.util.*;
	public class If_else_compare_number {
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int t;
	        t = Integer.parseInt(br.readLine());
	        while(t-- > 0){
	            
	            int n;
	            n = Integer.parseInt(br.readLine());
	            
	            
	            int m;
	            m = Integer.parseInt(br.readLine());
	            
	            Solution2 obj = new Solution2();
	            String res = obj.compareNM(n, m);
	            
	            System.out.println(res);
	            
	        }
	    }
	}
	 class Solution2 {
	    public static String compareNM(int n, int m) {
	        // code here
	        if(n<m){
	            return "lesser";
	        }
	        else if(n>m){
	            return "greater";
	        }
	        else{
	            return "equal";
	        }
	    }
	}


