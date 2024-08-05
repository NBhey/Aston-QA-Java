import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt();
        System.out.print("Input b number: ");
        int b = in.nextInt();

        comparisonAndCalculation(a, b);
        in.nextLine();
        System.out.print("Input a string: ");
        String str1 = in.nextLine();
        System.out.print("Input a string: ");
        String str2 = in.nextLine();
        comparsionString(str1, str2);
        
        System.out.print("Input the size of the array: ");
        int count = in.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Input the elements of the array: ");
            arr[i] = in.nextInt();
        }
        createArrWithEvenNumber(arr);
        in.close();
    }
    public static void comparisonAndCalculation(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        } else {
            System.out.println(num1 + " = " + num2);
        }
        System.out.println("Сложение: " + (num1 + num2));
        System.out.println("Вычитание: " + (num1 - num2));
        System.out.println("Умножение: " + (num1 * num2));
        if (num1 == 0 || num2 == 0){
            System.out.println("Деление на 0 запрещено");
        } else {
            System.out.println("Деление: " + (num1 / num2));
        }
        
    }
    
    public static void comparsionString(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    public static void createArrWithEvenNumber(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArr.add(arr[i]);
            }
        }
        System.out.println(newArr);
    }
}

