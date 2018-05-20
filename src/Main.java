import java.util.Scanner;

public class Main extends Models {

    public static void main(String[] args){
        System.out.println("Hello Mayank");


        // Selection sort algorithm
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {98,74,47,2,8,64,524,95,847,72};
        printLn("Array before sorting...");

        for (int i=0; i<arr.length; i++){
            print(arr[i]+ " ");
        }

        printLn("\nArray after sorting...");
        selectionSort.selectionSort(arr);

        for (int i=0; i<arr.length; i++){
            print(arr[i]+ " ");
        }




        //Bubble sort algorithm
//        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
//        int arr[] ={3,60,35,2,45,320,5};
//
//        printLn("Array Before Bubble Sort");
//        for(int i=0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        printLn("");
//
//        bubbleSortAlgorithm.bubbleSortAlgorithm(arr);
//
//        printLn("Array After Bubble Sort");
//        for(int i=0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        // Check Armstrong Number
//        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
//        Scanner scanner = new Scanner(System.in);
//        printLn("Enter Number\n");
//        int number = scanner.nextInt();
//        armstrongNumber.checkArmstrongNumber(number);

        // Check Factorial
//        Scanner scanner = new Scanner(System.in);
//        printLn("Enter number\n");
//        Factorial factorial = new Factorial();
////        factorial.factorialUsingLoop(scanner.nextInt());
//        int number = scanner.nextInt();
//        printLn("Factorial of " + number + " is " + factorial.factorialUsingRecursion(number));

        //Fibonacci fibonacci = new Fibonacci();

        // FIbonacci Series without recursion
        //fibonacci.fibonacciSeriesWithoutRecursion(10,0,1);

        // Fibonacci series using recursion
        //print("\n");
        //print("0 1");
        //fibonacci.fibonacciSeriesUsingRecursion(10-1,0,1);

        // Check prime number
//        PrimeNumber primeNumber = new PrimeNumber();
//        primeNumber.checkMyPrime(6);
//        primeNumber.checkPrime(7);
//        if (primeNumber.checkPrimeNumber(2)){
//            printLn("Number is prime");
//        }else {
//            printLn("Number is not prime");
//        }
//        if (primeNumber.checkPrimeNumber(21)){
//            printLn("Number is prime");
//        }else{
//            printLn("Number is not prime");
//        }
//        if (primeNumber.checkPrimeNumber(7)){
//            printLn("Number is prime");
//        }else {
//            printLn("Number is not prime");
//        }

        // Check Palindrome
//        Palindrome palindrome = new Palindrome();
////        palindrome.checkPalindrome(456);
//        palindrome.checkPalindromeString();
    }

}
