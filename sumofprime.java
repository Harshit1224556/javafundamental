package Function.function1;
import java.util.Scanner;
public class sumofprime{
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
       int min = 0,max = 0;
        for(int i=2;i<=n;i++){

            if(Checkprime(i) && Checkprime(n-i)) {
                min = i;
                max = n-i;
                break;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

  static  boolean Checkprime(int n){

        for(int i = 2;i<n;i++){
            if(n%i==0) return false;
        }
       return true;
  }
}
