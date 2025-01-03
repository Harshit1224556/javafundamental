package Function.function1;
import java.util.Scanner;
public class cube{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         System.out.println(cubes(n));
    }
     static int cubes(int n){
          return n *n *n;
     }
}








