import java.util.Scanner;
public class sum_of_natural {
    static int sum(int n) {
    if ( n==1)
        return 1;
    else
          return n*(n+1)/2;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
    

    }
    