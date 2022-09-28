import java.util.Scanner;  
public class sum_of_2numbers01  
{  
public static void main(String[] args)  
{  
int x, y, sum;  
Scanner scan = new Scanner(System.in);  
System.out.println("Enter the first number: ");  
x = scan.nextInt();  
System.out.println("Enter the second number: ");  
y = scan.nextInt();  
sum = sum(x, y);  
System.out.println("The sum of two numbers x and y is: " + sum);  
}    
public static int sum(int a, int b)  
{  
int sum = a + b;  
return sum;
}  
} 
