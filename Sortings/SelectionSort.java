

class SelectionSort{
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
           int smallest = i;
           for (int j=i+1;j<n;j++)
           {
               if(arr[smallest]>arr[j])
               {
                  smallest = j;
               }
               int temp = arr[smallest];
               arr[smallest] = arr[i];
               arr[i] = temp;
           }
        }
        printarray(arr);
    }
}