import java.util.*;

public class conditional
{
   public static void main(String[] args)
   {
      int numberOne, numberTwo, largest;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the First Number: ");
      numberOne = scan.nextInt();
      System.out.print("Enter the Second Number: ");
      numberTwo = scan.nextInt();
      
      if(numberOne>numberTwo)
         largest = numberOne;
      else
         largest = numberTwo;
      
      System.out.println("\nLargest = " +largest);
   }
}
