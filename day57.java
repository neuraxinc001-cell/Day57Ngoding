import java.util.Scanner;
public class day57 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      for(int i = 1;i<=a;i++){
        if(i%2==0) {System.out.println(i + " GENAP ");}
        else {System.out.println(i + " GANJIL ");}
      }
    }
}
