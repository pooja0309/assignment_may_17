
package com.test.threads;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MemoryLeakExample {
	private Map cache = new HashMap<>();
	   public int square(int i) {
	      int result = i * i;
	      cache.put(i, result);
	      return result;
	   }

	   public static void main(String[] args) throws Exception {
		      MemoryLeakExample mle = new MemoryLeakExample();
		      int i=0;
		      while (true) {
		         //System.out.println("Enter a number between 1 and 100");
		         //i = mle.readInput();
		         i=i+1;
		         System.out.println("Answer " + mle.square(i));
		      }
	   }
}
	   /*private int readInput() {
		    
		      Scanner sc =new Scanner(System.in);   
		      return sc.nextInt();  
		      }*/