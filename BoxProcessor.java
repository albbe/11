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
        for (int i = 1; i < n; i++){
            Box current = array [i - 1];
            Box next = array[i];
            int j = i - 1;
                if (current.compareTo(next) > 0) {
                    swap(array, i, j);
                }
            }
    }

    public void sort(List<Box> list){
        int n = list.size();
        if (n <= 0){
        } 
        if (n == 1){
        }
        for (int i = 1; i < n; i++){
            Box current = list.get(i);
            Box next = list.get(i-1);
            int j = i - 1;
            if (current.compareTo(next) > 0){
                swap(list, i, j);
            }
        }
    }

    public static final <box> void swap (Box[] array, int i, int j){
        Box box = array [i];
        array [i] = array [j];
        array [j] = box;
    }

    public static final <box> void swap (List<box> list, int i, int j){
        Collections.swap(list, i, j);
    }
    
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