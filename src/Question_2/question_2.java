package Question_2;
import java.util.*;

public class question_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        System.out.print("Enter d: ");
        int d = scanner.nextInt();
        System.out.print("NOD: " + nod(a, nod2(b,nod1(c,d)))); //используем принцип: НОД(а,b,c,d) = НОД(а,(НОД(b,НОД(с,d)));
    }
    static int nod1(int c, int d) {
        while(c!=0 && d!=0) {
            int k = d;
            d = c%d;
            c = k;
        }
        return c+d;
    }
    static int nod2(int b, int nod1) {
        while(b!=0 && nod1!=0) {
            int z = nod1;
            nod1 = b%nod1;
            b = z;
        }
        return b+nod1;
    }
    static int nod(int a, int nod2) {
        while (a != 0 && nod2 != 0) {
            int m = nod2;
            nod2 = a % nod2;
            a = m;
        }
        return a + nod2;
    }
}



