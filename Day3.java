 import java.util.Scanner;
 public class Day3 {
   /*  static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
    public static void main(String [] args){
        System.out.println()
    } */
       
        
    //print first n natural no.

    /*static void numbers(int n){
        for (int i=0;i<=n;i++){
            System.out.print(i+" ");
        }
        }
        static void main(String [] args){

    } */

   /*  static boolean checkprime(int n){
        for(int i=2;i<n;i++)
        if (n%i== 0) return false;
        return true;
    }
    public static void main(String [] args){
         int n=3;
        System.out.println(checkprime(n));
 }*/

   /*  static int inverse(int n){
        int temp=0;
        while(n!=0){
            temp=temp*10+ n%10;
            n/=10;
        }
        return temp;
    }
     public static void main(String [] args){
        int n=1805;
        System.out.print(inverse(n));
    }*/

    /*static int digits(int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;

    }
    public static void main(String [] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.print(digits(n));
        sc.close();
    }*/

   /*  static int countd(int n){
        int count=0;
        while (n!=0){
            count++;
            n/=10;
        }
        return count;
    }
    static boolean armstrong(int n){
        int d=countd(n);
        int sum=0;
        int temp=n;
        while(n!=0){
            sum+=Math.pow((n%10),d);
            n/=10;
        }
        return(sum==temp);
    }
    public static void main(String [] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.print(armstrong(n));
        sc.close();
    }*/

   /*  static void printArr(int[] arr){
        for(int i:arr)
        System.out.print(i+" ");
        }
        public static void main(String[] args) {
            
            int[] arr={1,2,3,4,5,6};
            printArr(arr);
        }*/
        //return the sum of array:1,2,3,4,5
        //print the array in reverse order:5,4,3,2,1
    
      /*   static void total(int[] arr){
            int sum=0;
            for(int i=0;i<arr.length;i++)
            sum=sum+arr[i];
            System.out.print(sum);
        }
        public static void main(String [] args){
            int[] arr={1,2,3,4,5};
            total(arr);
              
        }*/

     /*    static void reverse(int[] arr){
            int sum=0;
            int a=1;
            int b=4;
            for(int i=a;i<b;i++)
            sum+=arr[i];
            System.out.print(sum);

        }
        public static void main(String[] args) {
            int[] arr={1,2,3,4,5};
            reverse(arr);
        }*/

      /*   static void printRev(int[] arr){
            for (int i=arr.length-1;i>=0;--i)
                System.out.print(arr[i]+" ");
                System.out.println();

        }
        public static void main(String[] args){
            int[] arr={1,2,3,4,5};
            printRev(arr);
        }*/


 }