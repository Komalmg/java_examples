package TheKiranAcademy5;

public class sumofeven {
	

	    public static void main(String[] args) {
	        int evenSum = 0;
	        int oddSum = 0;  

	    
	        for (int i = 1; i <= 1000; i++) {
	            if (i % 2 == 0) {
	                evenSum += i; 
	            } else {
	                oddSum += i; 
	            }
	        }

	     
	        System.out.println("Sum of even numbers between 1 and 1000: " + evenSum);
	        System.out.println("Sum of odd numbers between 1 and 1000: " + oddSum);
	    }
	}


