package Onclass1;

public class Main {
    public static void main(String[] args) {
        int numbers = 20;
        int count = 0;
        int N = 2;
        while (count < numbers) {
                boolean checkPrimer = true;
                for (int i = 2; i < N - 1; i++) {
                    if (N % i == 0) {
                        checkPrimer = false;
                    }
                }
                if (checkPrimer) {
                    System.out.println(N);
                    count++;
                }
            N++;
        }
    }
}