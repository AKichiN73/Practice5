import java.util.Scanner;

public class Task11 {
    public static int func(int a, int b, int c) {
        if ((a == 0) & (b == 0)) {
            System.out.println(c);}
            Scanner scan = new Scanner(System.in);
            if (a == 1) {
                c += 1;
            }
            b = a;
            a = scan.nextInt();
            func(a, b, c);

        return c;
    }

    public static void main(String[] args) {

        System.out.println(func(-1,-1,0));
    }
}
