public class StarPatterns
{
    public static void main (String[] args)
    {
        int i, j;
        int num = 4;
        
        //First Pattern
        System.out.println("1)");  
        for (i = 0; i < num; i++) // number of rows - outer loop
        {
              for (j = 0; j <= i; j++) // number of columns - inner loop
        {
        System.out.print("*");
        }
        System.out.println(); // new line after each row
   }
	    System.out.println(". . . . . . . . ."); 
	    
	    //Second Pattern
	    System.out.println("\n");  
        System.out.println("2)");  
	    System.out.println(". . . . . . . . .");  
		for (i = num - 1; i >= 0; i-- ) // number of rows - outer loop
		    {
		    for (j = 0; j <= i; j++)
		    {
		        System.out.print("*");
		    }
        System.out.println(); // new line after each row
    		}
    		
        //Third Pattern
        System.out.println("\n"); 
        System.out.println("3)");  
		for (i = 1; i <= num; i++ ) // number of rows - outer loop
		    {
		    for (j = 0; j < num - i; j++) // inner loop space
		    {
		        System.out.print(" ");   
            }   
		        for (j = 0; j < (i*2)-1; j++) // 2nd inner for loop - each row contains (2*row number-1)of stars
		        {
		            System.out.print("*");
		        }
        		System.out.println(); // new line after each row
            	}
	 	System.out.println(". . . . . . . . ."); 
	 	System.out.println("\n"); 
	 	
	 	//Fourth Pattern
        System.out.println("4)");
        System.out.println(". . . . . . . . .");
		for (i = 4; i >= 1; i-- ) // number of rows - outer loop
		    {
		    for (j = 0; j <= num - i; j++) // inner loop space
		    {
		        System.out.print(" ");   
            }   
		        for (j = 0; j < (i*2)-1; j++) // 2nd inner for loop - each row contains (2*row number-1)of stars
		        {
		            System.out.print("*");
		        }
            System.out.println(); // new line after each row
            }
	}
}
