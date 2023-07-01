//Given a positive integer N, print count of set bits in it. 


import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int N = sc.nextInt();
		    Solution ob = new Solution();
		    int cnt = ob.setBits(N);
		    System.out.println("answer:"+cnt);
		}
		//System.out.println("Hello World");
	}
}
class Solution {
    static int setBits(int N) {
        // code here
        int count = 0;
        while(N != 0){
        count+= N&1;
        N >>= 1;
    }
            return count;

    }
    
}