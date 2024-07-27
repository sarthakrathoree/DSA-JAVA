class Day2 {
public static void main(String[] args) {
  //question 1
  
  
   /*   int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++)
        System.out.print("* ");
        System.out.println();
    }*/

//question2

   /*  int n=5;
    for(int i=1;i<=n;i++){
        for (int j=1;j<=i;j++)
        System.out.print("* ");
        System.out.println();
    }*/

//question 3

  /*  int n=5;
       for (int i=1;i<=n;i++){
       for(int j=1;j<=n-i+1;j++)
        System.out.print("* ");
        System.out.println();
    }*/

//question 4

  /*  int n=5;
    for (int i=1;i<=n;i++){
        for (int k=1;k<=n-i;k++)
            System.out.print("  ");
            for (int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
    }*/

//quetion 5

 /*  int n=6;
    for (int i=1;i<=n;i++){
        for(int k=1;k<=n+i;k++)
            System.out.print("  ");
            for (int j=1;j<=n-i;j++)
            System.out.print("* ");
            System.out.println();
    
    


    }*/

//question 6

   /*  int n=6;
    for (int i=1;i<=n;i++){
        for(int k=1;k<=n+i;k++)
            System.out.print("    ");
            for (int j=1;j<=n-i;j++)
            System.out.print("* ");
            System.out.println();
    }*/

//question 7

 /*    int n=5;
    for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
            if (i==1 || i==n || j==1 || j==n)
            System.out.print("* ");
            else
            System.out.print("  "); 
    }
    System.out.println();
}*/

//question 8

    /*int n=5;
    for(int i=1;i<=n;i++){
        for (int j=1;j<=n;j++){
        if (i==j || j==n-i+1)
            System.out.print("* ");
            else
            System.out.print("  "); 
    }
    System.out.println();
}*/

//question 9

/*int n=5;
for(int i=1;i<=n;i++){
    // first tri
    for(int k=1;k<=(n-i);k++)
        System.out.print("  ");
    for(int j=1;j<=i;j++)
        System.out.print("* ");
    // second tri
    for(int j=1;j<=i-1 && j<=n;j++)
        System.out.print("* ");


    System.out.println();
}*/

//question 10

    /*int n=5;
    for(int i=1;i<=n;i++){
        for(int k=1;k<=n+i;k++)
        System.out.print("  ");
        for(int j=1;j<=n-i;j++)
        System.out.print("* "); 
    
    for(int j=1;j<=n-i+1 ;j++)
        System.out.print("* ");    
    
    System.out.println();


    }*/

    //question 11

   /*  int n=5;
    for (int i=1;i<=n;i++){
        for(int k=1;k<=n-i;k++)
            System.out.print("  ");
        for(int j=1;j<=i;j++){
            if(j%2!=0)
            System.out.print("* ");
            else
            System.out.print("  ");
        }
        for(int j=1;j<=i-1;j++){
            if((j+i)%2!=0)
            System.out.print("* ");
            else
            System.out.print("  ");
        }
        System.out.println();
}*/

//question 12

 /*    int n=5;
    for (int i=1;i<=n;i++){
        for(int k=1;k<=n-i;k++)
            System.out.print("  ");
        for(int j=1;j<=i;j++){
            if(j%2!=0)
            System.out.print("* ");
            else
            System.out.print("! ");
        }
        for(int j=1;j<=i-1;j++){
            if((j+i)%2!=0)
            System.out.print("* ");
            else
            System.out.print("! ");
        }
        System.out.println();
}*/

//question 13

 /*    int n=5;
    for(int i=1;i<=n;i++){
        for (int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();

        
    }
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++)
            System.out.print("* ");
            System.out.println();
    }*/

//question 14

    /*int n=5;
    for (int i=1;i<=n;i++){
        for (int k=1;k<=n-i;k++)
            System.out.print("  ");
            for (int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
    }
    for (int i=1;i<=n;i++){
        for(int k=1;k<=n+i-5;k++)
            System.out.print("  ");
            for (int j=1;j<=n-i;j++)
            System.out.print("* ");
            System.out.println();
    }*/

//question 15

  /*   {int n=6;
    for (int i=1;i<n;i++){
        for(int k=1;k<=n+i-6;k++){
            System.out.print("    ");}
            for (int j=1;j<=n-i;j++){
            System.out.print("* ");}
            
            System.out.println();
            
    }
    for (int i=2;i<n;i++){
        for(int k=1;k<=n-i;k++)
            System.out.print("    ");
            for (int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
    }
}*/

//question 16

/*{int n=5;
    for (int i=n;i>=1;i--){
        for(int k=1;k<=i-1;k++){
            System.out.print("  ");}
            for (int j=1;j<=i;j++){
            System.out.print("* ");}
            
            System.out.println();
            
    }
    for (int i=2;i<=n;i++){
        for(int k=1;k<=i-1;k++)
            System.out.print("  ");
            for (int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
    }
}*/

//question 17

    
 
}
}