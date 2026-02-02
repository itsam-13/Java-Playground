package Basics;
import java.util.Scanner;

import static java.lang.System.in;

public class increment_decrement {
    static void main() {
        int x =5;
        System.out.println(x++); // first use then increase
        System.out.println(x);

        int y=7;
        System.out.println(++y); //first increase then use
        System.out.println(y);

        int z=5;
        System.out.println(--z);
        System.out.println(z);

        int a=5;
        System.out.println(a--);
        System.out.println(a);
        Scanner sc = new Scanner(in);
        int r;
        System.out.println("Enter a number");
        r = sc.nextInt();

    }
}
