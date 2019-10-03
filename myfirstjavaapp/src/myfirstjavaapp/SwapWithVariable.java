public class SwapWithVariable
{
   public static void main(String[] args)
   {
    
	  int a=10;
	  int b=90;
	  int c;
	   
     
      System.out.println("Before Swapping\nx = "+a+"\ny = "+b);
     
      c=a;
      a=b;
      b=c;
     
      System.out.println("After Swapping\nx = "+a+"\ny = "+b);
   }
}