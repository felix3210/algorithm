package com.wi1024.enhance.sort;

public class InsertSort {

    public static void sort(int[] arr){
        for(int i=1; i < arr.length ;i++){
            int value = arr[i];
            int j = i - 1;

            //插入已排序列表
            for(;j >= 0 ; j--){
                if(arr[j] > value){
                    arr[i] = value;
                }
            }

            while(j >= 0 && arr[j] > value){

                j--;
            }
        }
    }

}
