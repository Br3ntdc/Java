import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     System.out.println("Exercice 1");
      generateArray();

      System.out.println("Exercice 2");
      sumArray();

     System.out.println("Exercice 3");
        largestNumber();

        System.out.println("Exercice 4");
        reverseArray();

        System.out.println("Exercice 5");
        evenOdd();
    } public static void generateArray() {
        int[] arr = new int[]{10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
          public static void sumArray() {
            int sum = 0;
            int[] arr = new int[]{3, 7, 1, 9, 2, 8};
             for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
             }
             System.out.println(sum);
        }
        public static void largestNumber() {
        Scanner sc = new Scanner(System.in);
            int[] arr = new int[7];
            int max = 0;
        System.out.println("Enter seven numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("this is the largest number: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
         System.out.println(max);
        }
        public static void reverseArray() {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        // it just said to print reverse order not to reverse the array soooooooooooooooooooo
            for (int i = arr.length - 1; i > -1; i--) {
                System.out.print(arr[i] + " ");
            }

        }
        public static void evenOdd(){
        Random rand = new Random();
        int[] arr = new int[10];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1, 50);
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;

            } else {
                odd++;
            }
        }
            System.out.println("even: " + even );
            System.out.print("odd: " + odd );
        }
    }
