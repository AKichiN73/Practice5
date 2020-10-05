import java.util.Scanner;

public class Task10 {
    public static int reverse(int n, int a) {

        if (n == 0) {
             return a;
        }
        else {
            return reverse(n/10, 10*a+n%10);
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x= scan.nextInt();
        System.out.println(reverse(x,0));
    }
}
