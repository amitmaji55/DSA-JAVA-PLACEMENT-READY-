class Bubble_Sort{
 public static void printarray(int[] arr)
 {
     for (int i=0;i<arr.length;i++) {
         System.out.print(arr[i]+ " ");
     }
     System.out.println();
 }
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 3, 2};
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            for (int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printarray(arr);
    }
}