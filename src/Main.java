import java.util.Scanner;
public class Main {
    static void sort(int[] arr, int length){
        int i, j, temp;
        boolean swapped;
        for(i = 0; i < length - 1; i++){
            swapped = false;
            for (j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)break;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = Integer.parseInt(s.nextLine());
        if(number < 0){
            System.out.print("Error!! Your input is incorrect.");
            return;
        }
        int[] numbers = new int [number];
        for(int i = 0; i < number; i++){
            Scanner num = new Scanner(System.in);
            System.out.print("Enter number: ");
            numbers[i] = Integer.parseInt(num.nextLine());
        }
        sort(numbers, numbers.length);
        for (int intNumber : numbers) System.out.print(intNumber + " ");
    }
}
