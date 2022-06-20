
import java.util.Scanner;

class Rational {
    private int p;
    private int q;

    // Define constructor
    Rational(int p, int q) {
        this.p = p;
        this.q = q;
    }

    // Override method toString()
    public String toString() {
        return this.p + "/" + this.q;
    }

    // Define public Rational product(Rational r)
    public Rational product(Rational r) {
        int p3 = this.p * r.p;
        int q3 = this.q * r.q;
        return new Rational(p3, q3);
    }
}

public class Rational7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rational r1 = new Rational(scanner.nextInt(), scanner.nextInt());
        Rational r2 = new Rational(scanner.nextInt(), scanner.nextInt());
        Rational r3 = r1.product(r2);
        System.out.println(r3);
    }
}