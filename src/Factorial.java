public class Factorial extends Models {
    //Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. For example:
    // 4! = 4*3*2*1 = 24
    //5! = 5*4*3*2*1 = 120

    // 1> Factorial program using loop
    public void factorialUsingLoop(int number){
        int fact = 1;
        for (int i = 1; i<=number; i++){
            fact*=i;
        }
        printLn("Factorial of "+ number + " is " + fact);
    }

    // 2> Factorial program using recursion
    public int factorialUsingRecursion(int number){
        if (number ==0){
            return 1;
        }else {
            return number * factorialUsingRecursion(number -1);
        }
    }
}
