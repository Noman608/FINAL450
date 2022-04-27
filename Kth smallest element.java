class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        int kthElement=0;
        Arrays.sort(arr);
        for(int i =0;i<k;i++){
            if(i==k-1){
               kthElement=arr[i]; 
            }
        }
        return kthElement;
    } 
}
