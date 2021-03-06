package com.wi1024.enhance.sort;

import com.wi1024.enhance.sort.util.SortUtil;

/**
 * 快速排序算法
 * Created by Song on 2017/2/24.
 */
public class QuickSort {


    public static void sort(int[] arr , int low , int high){
        if(arr.length < 2){
            return;
        }
        if(low < high){
            //获取中轴
            int pivot = partiton(arr , low , high);
            //左分区快排
            sort(arr, low , pivot - 1);
            //右分区快排
            sort(arr, pivot + 1 ,high);
        }

    }


    public static int partiton(int[] arr , int low ,int high){
        int rand = (int) (Math.random() * (high - low)) + low;
        int base = arr[rand];
        //交换arr[low],arr[rand]值
        if(rand != low){
            arr[rand] = arr[low];
            arr[low] = base;
        }
        while(low < high){
            while(low < high && arr[high] >= base){
                high--;
            }
            arr[low] = arr[high];
            while(low < high && arr[low] <= base){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = base;
        return low;
    }

    public static void swap(int[] arr , int i , int j){
        int tmp = arr[i];
        arr[i]  = arr[j];
        arr[j]  = tmp;
    }

    public static void main(String[] args) {
       int[] arr = SortUtil.loadConsoleIntArray();
        sort(arr, 0 ,arr.length - 1);
        SortUtil.printArray(arr);
    }

}
