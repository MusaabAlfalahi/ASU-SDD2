package edu.asu.sdd.training;

import java.util.Scanner;

public class FirstExample {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double distance;
        int rad;
        System.out.print("Enter your radius: ");
        rad = input.nextInt();
        for (int i = 0; i <= 2 * rad; i++) {
            for (int j = 0; j <= 2 * rad; j++) {
                distance = Math.sqrt(Math.pow(i - rad, 2) + Math.pow(j - rad, 2));
                if (distance > rad - 0.5 && distance < rad + 0.5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


//        System.out.println("please enter number 1: ");
//        int number1 = input.nextInt();
//        System.out.println("please enter number 2: ");
//        int number2 = input.nextInt();
//        boolean exit = false;
//        while (!exit) {
//            showMenu();
//            int choice = input.nextInt(), result = 0;
//            switch (choice) {
//                case 1:
//                    result = number1 + number2;
//                    break;
//                case 2:
//                    result = number1 - number2;
//                    break;
//                case 3:
//                    result = number1 * number2;
//                    break;
//                case 4:
//                    result = number1 / number2;
//                    break;
//                case 5:
//                    exit = true;
//                    break;
//            }
//            System.out.println("result: " + result);
//        }
//        System.out.println("Thank you, goodbye");

//        int number = input.nextInt();
//        for (int i=0;i<number;i++){
//            System.out.print('*');
//        }
//        System.out.println();
//        for (int i=0;i<number;i++){
//            for (int j = 0; j < number-i-1; j++) {
//                System.out.print(' ');
//            }
//            for(int j=0;j<i;j++){
//                System.out.print('*');
//            }
//            System.out.print('*');
//            for (int j = 0; j < i; j++) {
//                System.out.print('*');
//            }
//            System.out.println();
//        }
    }

//    public static void showMenu() {
//        System.out.println("-------------------------------------");
//        System.out.println("1- Add");
//        System.out.println("2- Sub");
//        System.out.println("3- Mul");
//        System.out.println("4- Div");
//        System.out.println("5- Quit");
//        System.out.println("-------------------------------------");
//        System.out.println("please enter your choice: ");
//    }
}
