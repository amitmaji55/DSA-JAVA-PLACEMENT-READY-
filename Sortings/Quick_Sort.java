class quick_sort{
    public static int partition(int[] arr,int low,int high)
    {
            int pivot = arr[high];
            int i = low-1;
            for (int j=low;j<high;j++)
            {
                if(arr[j]<pivot)
                {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            i++;
            int temp = arr[i];
            arr[i] = pivot;
            arr[high] = temp;
            return i;
    }
    public static void quick_sort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int pidx = partition(arr,low,high);
            quick_sort(arr,low,pidx-1);
            quick_sort(arr,pidx+1,high);
        }
    }
    public static void main(String[] args) {
     int arr[] = {1,2,3,4,5,6};
     int n = arr.length;
     quick_sort(arr,0,n-1);
     for(int i=0;i<arr.length;i++)
     {
         System.out.println(arr[i]+" ");
     }
    }
}
