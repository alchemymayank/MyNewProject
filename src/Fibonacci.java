//import fibonacci.
public class Fibonacci extends Models {

    int n3;

    public void fibonacciSeriesWithoutRecursion(int count, int n1, int n2){
        print(n1 + " " + n2);
        for (int m=2; m<=count; m++){
            n3 = n1+n2;
            print(" "+n3);
            n1 =n2;
            n2 =n3;
        }
    }

    public void fibonacciSeriesUsingRecursion(int count, int n1, int n2){
        if (count>0){
            n3 = n1+n2;
            print(" "+ n3);
            n1= n2;
            n2 = n3;
            fibonacciSeriesUsingRecursion(count-1, n1, n2);
        }
    }
}
