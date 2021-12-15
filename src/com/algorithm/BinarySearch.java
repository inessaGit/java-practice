package com.algorithm;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.*;
/*

https://www.educative.io/courses/coderust-hacking-the-coding-interview/k5qJx

We call an element of the sequence a candidate if,
at the current stage of the search, we cannot rule out that this item matches the target.
The algorithm maintains two parameters, low and high,
such that all the candidate elements have index at least low and at most high.
Initially, low = 0 and high = arr.length − 1
Ranges:
- first half: low to mid-1
- mid
- second half: mid+1 to high
We then compare the target value to the median candidate, that is, the element with index
               mid = (low + high)/2⌋ .

               We consider three cases:
• If the target equals the median, then we have found the item we are looking for, and the search terminates successfully.
• If the target is LESS than the median candidate, then we recur on the first half of the sequence, that is, on the interval of indices from low to mid − 1.
• If the target is GREATER than the median candidate, then we recur on the second half of the sequence, that is, on the interval of indices from mid + 1 to high.
An unsuccessful search occurs if low > high, as the interval [low,high] is empty.
 */

public class BinarySearch {

    //non recursive solution
    public static int rank (int key, int[] arr){
        int lo =0;
        int hi =arr.length-1;
        while (lo<=hi)
        {
            int mid =lo+(hi-lo)/2;
            if (key<arr[mid]) hi =mid-1;
            else if (key>arr[mid]) lo=mid+1;
            else return mid;
        }
        return -1;
    }

    public static void main (String args []){

    }
}
