package com.datastructure.array;

import java.util.Arrays;

/*
- Rotate array to the left by 1 means : all elements will move to the start of array by 1 place
-- to avoid loosing arr[0] we store it in temp
- Rotate array to the right by 1 means : all elements will shift to the end of array by 1 place
--- loop from the end arr[length -1 ]
-- to avoid loosing arr[length-1] we store it in temp
 */
public class ArrayRotate {
    //arr[i] = arr[i+1] shift elements to the left
    public static int[] arrayRotateLeft(int []arr,int numberOfRotations){
        int length = arr.length;
        System.out.println("original array "+ Arrays.toString(arr));
        for (int i=0; i<numberOfRotations;i++){
          int temp = arr[0];
          for (int j=0;j<length-1;j++){
              //shift towards left by 1 place
              arr[j]=arr[j+1];
              System.out.println(j+ " shift left "+ Arrays.toString(arr));
          }
          arr[length-1]=temp;
          System.out.println(i+ " number of rotations. Store temp in last elements "+ Arrays.toString(arr));
        }
        return arr;
    }
    //arr[j]=arr[j-1]
    public static int[] arrayRotateRight(int [] arr, int numberOfRotations){
      int length =arr.length;
        System.out.println("original array "+ Arrays.toString(arr));
        for (int i=0;i<numberOfRotations;i++){
         int temp=arr[length-1];
         for (int j=length-1; j>0;j--){
             //shift array elements to the right by one place
             arr[j]=arr[j-1];
             System.out.println(j+" shift right "+ Arrays.toString(arr));
         }
         arr[0]=temp;
         System.out.println(i+ " number of rotations. Store temp in last elements "+ Arrays.toString(arr));

        }
     return arr;
    }
    public static void main (String args []){
        int [] arr ={10,20,30,40};
        arrayRotateLeft(arr,2);
       // arrayRotateRight(arr,1);
    }
}
