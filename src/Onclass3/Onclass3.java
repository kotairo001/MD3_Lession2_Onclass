package Onclass3;

public class Onclass3 {
    public static void main(String[] args) {
        int numbers = 100;
        int N = 2;
        while (N < numbers) {
            if (N == 2) {
                System.out.println(N);
            } else {
                boolean checkPrimer = true;
                for (int i = 2; i < N - 1; i++) {
                    if (N % i == 0) {
                        checkPrimer = false;
                    }
                }
                if (checkPrimer) {
                    System.out.println(N);
                }
            }
            N++;
        }
    }
}
