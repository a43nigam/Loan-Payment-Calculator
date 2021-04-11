import java.util.Scanner;

public class loan_payment_calculator {
    public static void main(String[] args) {

        System.out.print("Enter initial loan amount: ");
        Scanner kb = new Scanner(System.in);
        double L = kb.nextDouble();
        System.out.println();
        
        System.out.print("Enter annual interest rate (percent): ");
        Scanner kb1 = new Scanner(System.in);
        double R = kb1.nextDouble();
        System.out.println();
        
        System.out.print("Enter loan term (months): ");
        Scanner kb2 = new Scanner(System.in);
        int n = kb2.nextInt();
        System.out.println();

        R = R / 100;
        double r = (R / 12);
        double num = L * Math.pow((1 + r), n) * r;
        double denom = Math.pow((1 + r), n) - 1;

        double M = (num / denom);
        M = Math.round(M * 100.0) / 100.0;

        System.out.print("Monthly payment = $" + M);
    }
}
