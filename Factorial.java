import java.util.Scanner;
public class Factorial {
        int fact(int n) {
            if (n==1 || n==0)
            return 1;
     else  
        return n * fact(n-1);
     }
     public static void main (String[] args) {
        Factorial f = new Factorial();
        int result =f. fact(5);
        System.out.println(result);

     }


     } 


    