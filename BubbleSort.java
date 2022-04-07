package com.muhammadsadri;

public class BubbleSort {

    //Method Untuk Meng Bubble Sort Array
    void programSorting(int array[]){
        int data = array.length;

        for (int i = 0; i < data - 1; i++) {
            for (int j = 0; j < data - i - 1; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    //Method Untuk Menampilkan Array
    void programMenampilkan(int array[]){
        int data = array.length;
        for (int i = 0; i < data; ++i) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        BubbleSort hasil = new BubbleSort();

        int array[] = {6, 22, 2, 10, 8, 7, 100, 1, 3, 5};

        hasil.programSorting(array);
        System.out.println("Hasil Sortingnya");
        hasil.programMenampilkan(array);
    }
}
