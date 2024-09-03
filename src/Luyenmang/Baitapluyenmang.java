package Luyenmang;

import java.util.ArrayList;
import java.util.Scanner;

class NumberExercise {

    public static ArrayList<Integer> EnterData(ArrayList<Integer> numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ":");
            numbers.add(scanner.nextInt());
        }
        return numbers;
    }

    public static void DisplayData(ArrayList<Integer> numbers) {
        System.out.println("Cac phan tu trong mang: " + numbers);

    }

    public static int findMax2(ArrayList<Integer> numbers) {
        if (numbers.size() < 2) {
            System.out.println("Mang phai co it nhat 2 phan tu.");
            return Integer.MIN_VALUE;
        }
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max1) {
                max2 = max1;
                max1 = number;
            } else if (number > max2 && number != max1) {
                max2 = number;
            }
        }
        return max2;
    }

    public static void deleteOddNumber(ArrayList<Integer> numbers) {
        numbers.removeIf(number -> number % 2 != 0);
    }
}

class Btluyenmang {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Nhap mang so nguyen ");
            System.out.println("2. Xuat mang ra ");
            System.out.println("3. Tim gia tri phan tu lon thu hai");
            System.out.println("4. Xoa cac phan tu le khoi mang ");
            System.out.println("5. Out");
            System.out.print("Chon tuy chon: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    NumberExercise.EnterData(numbers);
                    break;
                case 2:
                    NumberExercise.DisplayData(numbers);
                    break;
                case 3:
                    int max2 = NumberExercise.findMax2(numbers);
                    if (max2 != Integer.MIN_VALUE) {
                        System.out.println("Phan tu lon thu 2 trong mang la: " + max2);
                    }
                    break;
                case 4:
                    NumberExercise.deleteOddNumber(numbers);
                    System.out.println("Mang sau khi xoa cac phan tu le.");
                    NumberExercise.DisplayData(numbers);
                    break;
                case 5:
                    System.out.println("Out chuong trinh.");
                    break;
                default:
                    System.out.println("Khong hop le chon lai.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

