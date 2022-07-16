package com.company;

class Reverse_Binary_Search {
    public static void main(String[] args) {
        int[] arr = {97,45,48,40,32,29,25,10,5,1,-20};
        int target = 10;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                start = mid+1;
            } else if (target > arr[mid]) {
               end = mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
