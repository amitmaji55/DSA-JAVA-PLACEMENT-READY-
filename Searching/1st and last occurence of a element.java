class BinarySearch {
    public static  int  first_occurence_search(int[] arr, int target)
    {
        int res = -1;
        int start = arr[0];
        int end = arr.length-1;
        while(start<=end)
        {

            int mid = start + (end - start) /2;
            if(target == arr[mid])
            {
                res = mid;
                end = mid-1;
            }
            else if (target<arr[mid])
            {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return res;
    }
    public static  int  last_occurence_search(int[] arr, int target)
    {
        int start = arr[0];
        int end = arr.length-1;
        int res = -1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(target==arr[mid]){
                res = mid;
                start = mid+1;
            }
            else if (target<arr[mid])
            {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,10,10,11,12};
        int target = 10;
        int ans = first_occurence_search(arr, target);
        int ans1 = last_occurence_search(arr,target);
        System.out.println(ans+" is the first occurence" + "&"+ " the last occurence of the element is : "+ans1);
    }
}
