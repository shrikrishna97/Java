import java.util.*;

public class PosNegAvg {
    double posAvg = 0, negAvg = 0;
    double posCount = 0, negCount = 0;
    double pos;
    double neg;

    public void avg(int arr[]) {
        // writen code here
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                posCount++;
                pos += arr[i];
                posAvg = pos / posCount;
            } else {
                negCount++;
                neg += arr[i];
                negAvg = neg / negCount;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PosNegAvg obj = new PosNegAvg();
        int length = scanner.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        obj.avg(arr);
        System.out.println(obj.posAvg);
        System.out.println(obj.negAvg);
    }
}
