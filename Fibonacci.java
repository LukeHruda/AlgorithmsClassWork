import java.util.*;
public class Fibonacci{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i = 0; i<n;i++){
      int n1 =0;
      int n2 =1;
      int n3 =0;
      int fib = in.nextInt();
      if(fib == 0)
      {
        System.out.println("Fib(0) = 0");
      }
      else if(fib == 1)
      {
        System.out.println("Fib(1) = 1");
      }
      else
      {
        for(int j=1;j<fib;j++)//loop starts from 2 because 0 and 1 are already printed
        {
          n3=n1+n2;
          n1=n2;
          n2=n3;
        }
        System.out.println("Fib("+fib+") = "+n3);
      }
    }
  }
}
