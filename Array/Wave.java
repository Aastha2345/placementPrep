// Sort the array in wave form {up-down fashion}
package Array;

import java.util.Arrays;

public class Wave {
    public static void main(String[] args) {
        Wave sort = new Wave();
        int[] arr = {10,5,6,3,2,20,100,80};
        int n = arr.length;
        sort.sortInWave(arr, n);
        for(int i:arr){
            System.out.print(i + " ");
        }
    }

    public void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void sortInWave(int[] arr,int n){
        Arrays.sort(arr);
        for(int i=0;i<n-1;i+=2){
            swap(arr, i, i+1);
        }
    }
}
