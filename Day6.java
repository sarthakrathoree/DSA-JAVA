public class Day6 {
    /*static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key= arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]= arr[j];
                --j;
            }
            arr[j+1]= key;
        }
    }
    static void display(int []  arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
    }
    System.out.println();
}


    public static void main(String[] args) {
        int[] arr={9,8,7,5,6,45,1,2,3};
        // insertionSort(arr);
        display(arr);
    }*/


    /*static void selectionSort(int [] arr){
        for(int i =0;i<arr.length-1;i++){
                int idx=minimumValue(arr,i);
                int temp =arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
        }
    }
    static int minimumValue(int [] arr ,int a){
        int mini = a;
        for(int i=a+1;i<arr.length;i++)
        if(arr[mini]>arr[i])
        mini=1;
        return mini;
    }
    static void display(int []arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr ={5,4,3,2,1};
        selectionSort(arr);
        minimumValue(arr, 1);
        display(arr);
        
    }*/
}                      

