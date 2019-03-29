package creating_object;
import java.util.Scanner;

 public class Example {
	// TODO Auto-generated constructor stub

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 

    System.out.println("enter  two numbers and operator");
    System.out.println("enter first number");
    int intOne=scan.nextInt();
    
    System.out.println("enter second number");
    int intSecond=scan.nextInt();
    
    System.out.println("enter operator");
    char chOperator = scan.next().charAt(0);
    
    calculator obj = new calculator();
    obj.operator(intOne,intSecond,chOperator);
    
	}

}
    class calculator   {
    public void operator(int x, int y, char ch)
    {    
         
    	int z;
    	switch (ch)
    	
    	{
   	       case('+'):
   	       z=x+y;  
   		   System.out.println(x+"+"+y+"="+ z);
   		   break;
   	       case('-'):
   	       z=x-y;
   	       System.out.println(x+"-"+y+"="+z);
   	       break;
   	       case('*'):
   	       z=x*y;
   	       System.out.println(x+"*"+y+"="+z);
   	       break;
   	       case('/'):
   	       z=x/y;
   	       System.out.println(x+"/"+y+"="+z);
   	       break;
   	  }
    }
  }   
  
    				