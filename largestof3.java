package Function.function1;
import java.util.Scanner;
public class largestof3{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The greatest of the three number is " + largest1(a,b,c));
    }

    
    static int  largest1(int a,int b,int c){

        if(a>b && a>c) return a;
        if(b>a && b>c) return b;
        if(c>a && c>b) return c;

   return -1;

    }




}




