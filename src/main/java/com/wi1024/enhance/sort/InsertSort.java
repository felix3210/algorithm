package com.wi1024.enhance.sort;

import com.wi1024.enhance.sort.util.SortUtil;

/**
 * 插入排序算法
 * <p>
 *     Description:
 *          从数组第二个元素开始，以此与左侧元素进行比较，
 *          一轮比较后、保证左侧数值有序排列，然后再进行下一轮比较
 *
 *
 * </p>
 */
public class InsertSort {

    public static void sort(int[] arr){
        for(int i=1; i < arr.length ;i++){
            int value = arr[i];
            int j = i - 1;

            //插入已排序列表
            for(;j >= 0 ; j--){
                if(arr[j] > value){
                    arr[j+1] = arr[j];
                    arr[j] = value;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = SortUtil.loadConsoleIntArray();
        if(arr != null && arr.length > 1){
            sort(arr);
            SortUtil.printArray(arr);
        }
    }

}
