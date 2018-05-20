import java.util.Scanner;

public class PrimeNumber extends Models {
    //Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2.
    public void checkPrime(int n){
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            printLn(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    printLn(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }//end of else
    }

    public void checkMyPrime(int number){
        int m=0, i, flag=0;

        m= number/2;
        if (number==0||number==1){
            printLn(number+" Number is not prime");
        }else{
            for (i=2; i<=m; i++){
                if (number%i ==0){
                    printLn(number + " Number is not prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){printLn(number +" Number is prime");}
        }
    }

    public boolean checkPrimeNumber(int number){
        if (number<=1){return false;}
        for (int i =2; i<= Math.sqrt(number); i++){
            if (number%i == 0){return false;}
        }
        return true;
    }
}
