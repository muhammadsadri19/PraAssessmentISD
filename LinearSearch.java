package com.muhammadsadri;

public class LinearSearch {
    static int search(int[] arr, int n, int x)
    {
        for (int i = 0; i < n; i++) {
            // Return the index of the element if the element
            // is found
            if (arr[i] == x)
                return i;
        }

        // return -1 if the element is not found
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {30, 4, 7, 10, 8, 100, 33};
        int n = arr.length;

        int x = 9;

        int index = search(arr, n, x);
        if (index == -1)
            System.out.println("Data tidak ditemukan pada array");
        else
            System.out.println("Data ditemukan pada Index ke:  " + index);
    }
}
