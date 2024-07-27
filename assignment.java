//  1>sum of odd and even positions
import java.util.Scanner;
public class assignment{
/*static void printSum(int[] arr){
        int Sumodd=0, Sumeven=0;
        for (int i=0;i<arr.length;i++){
            if (i%2==0){
                Sumodd+=arr[i];
            }
            else{
            Sumeven+=arr[i];
            }
            }
            System.out.print("sum of elements of odd positions="+Sumodd);
            System.out.println();
            System.out.print("sum of elements of even positions="+Sumeven);
        }

        public static void main(String[] args) {
            int[] arr={1,2,3,4,5,6};
            printSum(arr);

         }*/



  

// 2>count digits

 /*   public static void main(String[] args) {
        int number = 5433231 ;
        int digit = 3;
        int count = countDigitOccurrences(number, digit);
        System.out.println("The digit " + digit + " appears " + count + " times in the number " + number);
    }

    public static int countDigitOccurrences(int number, int digit) {
        int count = 0;
        while (number > 0) {
            if (number % 10 == digit) {
                count++;
            }
            number /= 10;
        }
        return count;
    }*/

    
   //3>print reverse

 /*   static int reverse(int n){
    int temp=0;
    while (n!=0){
        temp=temp*10 + n%10;
        n/=10;


    }return temp;
}
public static void main(String args[]) {
    int n=123456789;
    System.out.print(reverse(n));


}*/

//4>binary to decimal

  /*   public static void main(String[] args) {
        String binaryNumber = "1101"; // Example binary number
        int decimalNumber = convertBinaryToDecimal(binaryNumber);
        System.out.println("Decimal equivalent of " + binaryNumber + " is " + decimalNumber);
    }

    public static int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            if (binary.charAt(length - 1 - i) == '1') {
                decimal += Math.pow(2, i);
            }
        }
        return decimal;
    }*/

    
 //5>lcm
/* public static void main(String[] args) {
    int n1 = 4, n2 = 6;

    // Calculate the GCD of n1 and n2
    int gcd = 1;
    for (int i = 1; i <= n1 && i <= n2; ++i) {
        if (n1 % i == 0 && n2 % i == 0) {
            gcd = i;
        }
    }

    // Calculate the LCM using the formula: LCM = (n1 * n2) / GCD
    int lcm = (n1 * n2) / gcd;
    System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);*/


//6>fibonacci no.

  /*   static int fib(int n){
        if(n<=1)
            return n;
        return fib(n-1) + fib(n-2); 

    }
    public static void main(String[] args) {
        int n=10;
        System.out.print(n +"th fibonacci no.="+ fib(n));
    }*/

    // 7>Conversion (Fahrenheit to Celsius)

   /*  public static void main(String[] args) {
        double fahrenheit,celsius;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the fahrenheit temperature=");
        fahrenheit=sc.nextDouble();

        celsius=(fahrenheit-32)*5/9;
        System.out.print("Celsius temperature is="+ celsius);
    }*/
    

    //8>Inverse of number


    /*static int reverse(int n){
        int rev=0;
        int rem;
        while(n>0){
        rem=n%10;
        rev=(rev*10)+rem;
        n/=10;
        }return rev;
    }

    public static void main(String[] args) {
        int n=32145;
        System.out.println("Reversed no. is="+ reverse(n));
    }*/

    //9>prime no.
   /*public static void main(String[] args) {
    int n=29;
    boolean flag=false;
    for(int i=2;i<=n/2;i++){
    
    if (n%i==0){
    flag=true;
    break;
    }
    }

    if(!flag)
    System.out.print("prime");
    else
    System.out.print("not prime");
}*/



// 10>GCD

  /*   public static void main(String[] args) {
    int num1=0,num2=0;
    Scanner sc=new Scanner(System.in);      
    
    System.out.print("Enter the first no.=");
    num1=sc.nextInt();

    System.out.print("Enter the second no.=");
    num2=sc.nextInt();

    while(num1!=num2){
        if (num1>num2)
        num1=num1-num2;
        else
        num2=num2-num1;

    }
    System.out.printf("The GCD of the no.is=%d",num2);
    }*/

    // 12>replacing no.

    
}











   
