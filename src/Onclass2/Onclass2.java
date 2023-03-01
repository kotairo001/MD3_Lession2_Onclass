package Onclass2;

import java.util.Scanner;

public class Onclass2 {
    public static void main(String[] args) {
//        int height;
//        int width;
//        int i;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("height = ");
//        height = sc.nextInt();
//        System.out.print("width = ");
//        width = sc.nextInt();
//
//        for(i = 1; i <= height; i++){
//            for(int j = 1; j <= width; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println("");
//        }
//
//        sc.close();
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.println("* ");
//                if(j==i-1) {
//                    System.out.println(" ");
//                }
//            }
//        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
                if (j == i - 1) {
                    System.out.println(" ");
                }
            }
        }

    }
}
