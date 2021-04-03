import java.util.Scanner;

public class monthly_loan_payment {
    public static void main(String[] args) {



        System.out.println("Enter initial loan amount: ");
        Scanner kb = new Scanner(System.in);
        double L = kb.nextDouble();
        System.out.println("Enter annual interest rate (percent): ");
        Scanner kb1 = new Scanner(System.in);
        double R = kb1.nextDouble();
        System.out.println("Enter loan term (months): ");
        Scanner kb2 = new Scanner(System.in);
        int n = kb2.nextInt();

        R = R / 100;
        double r = (R / 12);
//        double temp1 = (1 + r);
////        double temp2 = Math.pow(temp1, 2);
////        double temp3 = (L * temp2);
////        double temp4 = (r * temp3);
        double temp1 = L * Math.pow((1 + r), n) * r;
        double temp2 = Math.pow((1 + r), n) - 1;

//        double temp5 = Math.pow(temp1, n);
//        double temp6 = (temp5 - 1);

        double M = (temp1 / temp2);
//        M = (double) Math.round(M * 100.0) / 100.0;

        System.out.println("Monthly payment = $" + M);

    }
}
