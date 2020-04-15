package com.example.demo.test;

/**
 * 几种排序写法
 */
public class SortTest {

    //冒泡排序
    public static void main(String[] args) {


        int[] arr = {7, 10, 2, 4, 7, 1, 8, 5, 19};
        //快速排序
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //冒泡排序
        bubblingSort();
        //选择排序法 每次从现有数据挑出一个最小的直接放在最前面，第二次再将剩余的数据进行排序，拿出最小的放在最前面，以此类推。
        chooseSort();
    }

    public static void quickSort(int[] arr, int low, int high) {
        int i, j, temp, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        //temp就是基准位
        temp = arr[low];

        while (i < j) {
            //先看右边，依次往左递减
            while (temp <= arr[j] && i < j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp >= arr[i] && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j - 1);
        //递归调用右半数组
        quickSort(arr, j + 1, high);
    }

    public static void bubblingSort() {

        //从大到小
        int[] a = {3, 5, 4, 6, 2, 1, 7, 9};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    //第一个数小于第二个数
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int s : a) {
            System.out.print(s + "\t");
        }
        System.out.println();
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int ss : a) {
            System.out.print(ss + "\t");
        }
        System.out.println();
    }

    public static void chooseSort() {

        int[] aa = {3, 5, 4, 6, 2, 1, 9, 7};
        for (int i = 0; i < aa.length - 1; i++) {
            for (int j = 0 + i; j < aa.length; j++) {
                if (aa[i] > aa[j]) {
                    int temp = aa[i];
                    aa[i] = aa[j];
                    aa[j] = temp;
                }
            }
        }
        for (int sss : aa) {
            System.out.print(sss + "\t");
        }
    }
}
