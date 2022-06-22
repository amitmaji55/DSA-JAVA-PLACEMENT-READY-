public class OrderAgnosticBS {

    public static  int binary_search(int[] arr,int target)
    {
        int si = 0;
        int ei = arr.length-1;
        boolean isAsc = arr[si]<arr[ei];
        while(si<=ei)
        {
            int mid = si+(ei-si)/2;
            if(arr[mid]==target)
                return mid;
            if(isAsc)
            {
                if(arr[mid]<target)
                {
                    si = mid+1;
                }
                else {
                    ei = mid-1;
                }
            }
            else {
                if(arr[mid]>target)
                {
                    si = mid+1;
                }
                else{
                    ei = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = binary_search(arr, target);
        System.out.println(ans);
    }
}
