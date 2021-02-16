package hw6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 1, 4, 18, 17, 25};
        int[] arr = {1, 1, 1, 4, 4};
        System.out.println(oneOrFor(arr));
        afterFor(array);
    }

    public static int[] afterFor(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                index = i + 1;
            }
        }
        if (index == -1) {
            throw new RuntimeException();
        } else {
            int[] newArr = Arrays.copyOfRange(arr, index, arr.length);
            for (int i : newArr) {
                System.out.println(i);
            }
            return newArr;
        }
    }

    public static boolean oneOrFor(int[] arr) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                if (arr[i] != 4) {
                    return false;
                }
            }
            if (arr[i] == 1) {
                a = arr[i];
            }
            if (arr[i] == 4) {
                b = arr[i];
            }
        }
        if (a == 1 && b == 4) {
            return true;
        } else {
            return false;
        }
    }
}
