public class Day4 {
    //create a swap function to swap 2 values inside an array
    static void printArr(int[] arr){
        for(int i:arr)
        System.out.print(i+" ");
        }
    
  /*   static void swap(int[] arr,int i,int j){
        int c=arr[i];
        arr[i]=arr[j];
        arr[j]=c;
        
       

    }
    static void reverseUsingSwap(int[] arr){
        for (int i=0,j=arr.length -1;i<j;j--,i++)
        swap(arr,i,j);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        swap(arr, 1, 3);
        reverseUsingSwap(arr);
        printArr(arr);
        
    }*/

   
    
 /*    static boolean linearSearch(int[] arr,int n){
        for(int i:arr)
            if (i==n) return true;
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println();
        System.out.print(linearSearch(arr,3));
        System.out.println();
        System.out.println();
        System.out.println();

}*/

/*static boolean linearSearch(int[] arr,int n){
    for(int i:arr)
        if (i==n) return true;
    return false;
}
static boolean binarysearch(int[] arr,int n){
    int i=0,j=arr.length-1;
    while(i<=j){
        int mid=(i+j)/2;
        if (arr[mid]==n) return true;
        else if(arr[mid]<n) i=mid+1;
        else j=mid+i;
    
    }
    return false;
    }


public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    System.out.println();
    printArr(arr);
    System.out.println();
    System.out.print(binarysearch(arr,10));
    System.out.println();
    System.out.println();
    System.out.println();

}*/


    
}