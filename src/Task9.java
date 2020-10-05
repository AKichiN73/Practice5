import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.lang.*;
import java.util.Scanner;

public class Task9 {
    static int a;
    static int b;
    static int c;
    public static void recurtion(int a1,int b1, int c1) {
        if ((a1==a) & (b1==b)) {c += 1;}
        if ((a1!=a)&(c1!=0)){recurtion(a1+1,b1,0);}
        if ((b1!=b)){recurtion(a1,b1+1,1);}
     }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        recurtion(0,0,10);
        System.out.println(c);
    }
}
