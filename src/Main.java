public class Main {

    public static void main(String[] args){
        System.out.println("Hello Mayank");
        Fibonacci fibonacci = new Fibonacci();
        // FIbonacci Series without recursion
        fibonacci.fibonacciSeriesWithoutRecursion(10,0,1);

        // Fibonacci series using recursion
        print("\n");
        print("0 1");
        fibonacci.fibonacciSeriesUsingRecursion(10-1,0,1);
        
    }


    public static void print(String message){
        System.out.print(message);
    }


    static class Fibonacci{
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
}
