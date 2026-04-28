import java.util.Scanner;
public class Arithematic {
   public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in) ; 
       
      
        System.out.println("enter num1");
         int num1= sc.nextInt();
         System.out.print("enter num2");
           int num2= sc.nextInt();
           System.out.println("addition: " + (num1+num2));
           System.out.println("sub: " + (num1-num2));
           System.out.println("multiply: " + (num1*num2));
           System.out.println("modulus: " + (num1%num2));
      }
   }
