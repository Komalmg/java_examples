package TheKiranAcademy5;

public class triangularseries {
	

	    public static void main(String[] args) {
	        int terms = 10; 

	        System.out.println("Triangular Series:");

	        for (int i = 1; i <= terms; i++) {
	            int triangularNumber = (i * (i + 1)) / 2;
	            System.out.print(triangularNumber + " ");
	        }
	    }
	

}
