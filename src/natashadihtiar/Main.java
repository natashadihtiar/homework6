package natashadihtiar;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Example_1();
        int[] arr = new int [5];
        bubbleSort(arr);
        Example_4(arr);
        double sum = 0;
        Example_2(sum);
        double a =0;
        Example_3(a);
        Example_3_b(a);

        System.out.println("Введите число: ");
       int n = scanner.nextInt();
       int var = 2;
        printIsItNaturalNumber(var, n);

    }

    private static void bubbleSort(int[] arr) {

        System.out.println("*****Example4*****");
        for (int i =0; i<arr.length; i++) {

            arr[i] = ((int)(Math.random() * 10));}
            System.out.println(Arrays.toString(arr));


        System.out.println("\n");
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }}
        private static void Example_4(int [] arr){
            System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(arr));
    }
    private static void Example_3(double a) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "*****Example3_a*****");
        System.out.println("Введите число: ");
        a = scanner.nextDouble();

        if(a>0)
            System.out.println("Введенное число положительное.");
        else
        System.out.println("Введенное число отрицательное.");
}
    private static void Example_3_b (double a) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "*****Example3_b*****");
        System.out.println("Введите число: ");
        a = scanner.nextDouble();

        if(a%2==0)
            System.out.println("Введенное число делится на 2 бeз остатка.");
        else if (a%3==0 )
            System.out.println("Введенное число не делится на 3 бeз остатка.");
        else if(a%5==0)
            System.out.println("Введенное число делится на 5 бeз остатка.");
        else if (a%6==0)
            System.out.println("Введенное число делится на 6 бeз остатка.");
        else if(a%9==0)
            System.out.println("Введенное число делится на 9 бeз остатка.");
        else
            System.out.println("Данное число " + a +" не делится на 2,3,5,6,9 без остатка.");
    }
    private static void checkIsItANaturalNumber(int n) {
        System.out.println("******Example3_c*****");
        int var = 2;

        if (n > 1) {
            if (n % var != 0) {
                var++;
                checkIsItANaturalNumber(n);
            } else if (n % var == 0) {
                printIsItNaturalNumber(var, n);
            }
        }
    }
    private static void printIsItNaturalNumber(int var, int n) {

        if (var == n) {
            System.out.println(n + " натуральное число.");
        } else {
            System.out.println(n + " ненатуральное число.");
        }
    }


    private static void Example_2(double sum) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "*****Example2*****");
        System.out.println("Введите сумму в гривнах: ");
        double sum_1 = scanner.nextDouble();
        System.out.println("Выберите в какую валюту хотите перевести: 1 - в доллары, 2 - в евро, 3 - в рубли");
        int currency = 0;
        currency = scanner.nextInt();
        if(currency==1){
            sum = sum_1/26;
        System.out.println(sum+"  USD");}
         else if(currency == 2){
            sum = sum_1/30;
        System.out.println(sum+"  EUR");}
        else if (currency==3){
            sum = sum_1*4;
            System.out.println(sum+ "  RUB");}
        else
            System.out.println("  Ошибка.");

    }

    private static void Example_1() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "*****Example1*****");
        System.out.println("Введите сумму кредита: ");
        double credit = scanner.nextDouble();

        System.out.println("Payment 1");
        double payment1 = scanner.nextDouble();

        System.out.println("Payment 2");
        double payment2 = scanner.nextDouble();

        System.out.println("Payment 3");
        double payment3 = scanner.nextDouble();

        System.out.println("Payment 4");
        double payment4 = scanner.nextDouble();

        System.out.println("Payment 5");
        double payment5 = scanner.nextDouble();

        System.out.println("Payment 6");
        double payment6 = scanner.nextDouble();

        System.out.println("Payment 7");
        double payment7 = scanner.nextDouble();
        double payment = payment1+payment2+payment3+payment4+payment5+payment6+payment7;


        double balance = credit - payment;
        double overpayment = payment - credit;
        if (balance==0)
            System.out.println("Кредит погашен:");
        else if (balance>0)
            System.out.println("Задолжность: " + balance);
        else
            System.out.println("Переплата: " + overpayment);}}


