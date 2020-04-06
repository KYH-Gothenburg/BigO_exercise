package main.java;

import java.util.ArrayList;

class Main {

    private static boolean funcA(int value) {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }

    private static boolean funcB(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            int el1 = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                int el2 = arr2[j];
                if (el1 == el2) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int[] funcC(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }

    private static boolean funcD(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return true;
            }
        }
        return false;
    }

    private static void funcE(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }

    private static ArrayList<Integer> funcF(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (i == 1) {
                arr.add(0);
            } else if (i == 2) {
                arr.add(1);
            } else {
                arr.add(arr.get(i - 1) * arr.get(i - 2));
            }
        }
        return arr;
    }

    private static int funcG(int[] arr, int item) {
        int minIdex = 0;
        int maxIndex = arr.length - 1;
        int currentIndex = 0;
        int currentElement = 0;
        while (minIdex <= maxIndex) {
            currentIndex = (int) Math.floor((minIdex + maxIndex) / 2);
            currentElement = arr[currentIndex];
            if (currentElement < item) {
                minIdex = currentIndex + 1;
            } else if (currentElement > item) {
                maxIndex = currentIndex - 1;
            } else {
                return currentIndex;
            }
        }
        return -1;
    }

    private static int funcH(int[] arr) {
        return arr[(int) Math.floor(Math.random() * arr.length)];
    }

    public static void main(String[] args) {

    }
}