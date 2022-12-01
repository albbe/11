import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Random;

import javax.lang.model.util.ElementScanner14;

public class BoxProcessor{
    
    /**
     * a method using insertion sort to sort the boxes stored in an array
     * @param array
     */
    public void sort(Box[] array){
        int n = array.length;
        if (n <= 0){
        } 
        if (n == 1){
        }
        for (int i = 0; i < n-1; i++){
            int j = i;
            Box currentBox = array[i];
            Box nextBox = array[i+1];
            int sort = currentBox.compareTo(nextBox);
            while (j > 0 && sort > 0){
                int k = n - 1;
                swap(array, i, k);
            }
    
        }   
    }

    /**
     * a method using insertion sort to loop and sort an array of boxes according to volume from smallest to biggest
     * @param list the unsorted list of boxes
     */

    public void sort(List<Box> list){
        int n = list.size();
        if (n <= 0){
        } 
        if (n == 1){
        }
        for (int i = 1; i < n; i++){
            Box current = list.get(i-1);
            Box next = list.get(i);
            int j = i - 1;
            if (next.compareTo(current) > 0){
                swap(list, i, j);
            }
        }
    }

    /**
     * A helper-method to helt sort sort arrays
     * @param <box> the type of element in the array
     * @param array the array of boxes
     * @param i the index the smaller box should have
     * @param j the indes the bigger box should have
     */

    public static final <box> void swap (Box[] array, int n, int j){
        Box box = array [n-1];
        array [n-1] = array [j];
        array [j] = box;
    }
    /**
     * A helper-method to helt sort sort ArrayList
     * @param <box> the type of element in the ArrayList
     * @param list the array of boxes
     * @param i the index the smaller box should have
     * @param j the indes the bigger box should have
     */
    public static final <box> void swap (List<box> list, int i, int j){
        Collections.swap(list, i, j);
    }
    
    /**
     * a method to compare boxes in an array with another box to find it the array has a box with the same volume in it
     * @param array the array of boxes
     * @param box the box we want to compare the the boxes in the array
     * @return returns -1 if there are no equal boxes in the array
     */
    public int sequentialSearch(Box[] array, Box box){
        int n = array.length;
            for (int i = 0; i < n; i++){
                Box current = array[i];
                int boxCompare = box.compareTo(current);
                if (boxCompare == 0)
                    return i;
            }
            return -1;
        }

    //while(i > n && current.compareTo(box) != 0){
     //   i ++;
    // }


    /**
     * a method to compare boxes in an arrayList with another box to find it the list has a box with the same volume in it
     * @param list the list of boxes
     * @param box the box we want to compare with the boxes in the list
     * @return  returns -1 if there are no equal boxes in the list
     */
    public int sequentialSearch(List<Box> list, Box box){
        int n = list.size();
        for (int i = 0; i < n; i++){
            Box current = list.get(i);
            int boxCompare = box.compareTo(current);
            if (boxCompare == 0)
                return i;
        }
        return -1;
    }
    /**
     * a method to search a sorted array using binarysearch instead of sequental search
     * @param array the array of boxes
     * @param box the box we want to compare the the boxes in the array
     * @return -1 if there are no equal boxes (volume) in the array
     */

    public int binarySearch(Box[] array, Box box){
        int low = 0;
        int high = array.length;
        int mid = (low+high)/2;
        Box current = array[mid];
            if (box.compareTo(current) == 0){
                return mid;
            }
                else if (box.compareTo(current) == 1){
                low = mid + 1;
            }
                else {
                    high = mid -1;
                }
            return -1;
        }

        /**
         * a method to search a sorted array using binarysearch instead of sequental search
         * @param list of boxes
         * @param box the box we want to compare with the boxes in the list
         * @return returns -1 if there are no equal boxes in the list
         */

    public int binarySearch(List<Box> list, Box box){
        int low = 0;
        int high = list.size();
        int mid = (low+high)/2;
        Box current = list.get(mid);
            if (box.compareTo(current) == 0){
                return mid;
            }
                else if (box.compareTo(current) == 1){
                    low = mid + 1;
            }
                else {
                    high = mid -1;
            }
            return -1;
    }
}