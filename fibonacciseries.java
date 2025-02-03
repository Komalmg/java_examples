package TheKiranAcademy5;

public class fibonacciseries {
	

	    public static void main(String[] args) {
	        int terms = 10;

	       
	        int a = 1, b = 1;

	        System.out.println("Fibonacci Series:");

	       
	        System.out.print(a + " ");

	       
	        for (int i = 2; i <= terms; i++) {
	            System.out.print(b + " ");
	            int next = a + b; 
	            a = b;           
	            b = next;      
	        }
	    }
	

}
