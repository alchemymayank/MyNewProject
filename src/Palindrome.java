import java.util.Scanner;

public class Palindrome extends Models {

    public void checkPalindrome(int number){
        int temp, r, sum = 0;
        temp = number;
        while(number>0){
            r = number%10;
            sum = sum*10 +r;
            number = number/10;
        }
        if (temp == sum){
            printLn("Number is Palindrome");
        }else {
            printLn("Number is not palindrome");
        }
    }

    public boolean checkPalindromeBoolean(int number){
        int temp, r, reverse=0;
        temp = number;
        while(number>0){
            r = number%10;
            reverse = reverse*10 + r;
            number = number/10;
        }
        if (temp == reverse){
            return true;
        }else {
            return false;
        }
    }

    public void checkPalindromeString(){
        String original, reverse = "";
        Scanner scanner = new Scanner(System.in);
        printLn("Enter number or string...");
        original = scanner.nextLine();
        for (int i = original.length()-1; i>=0; i--){
            reverse = reverse+original.charAt(i);
        }
        if (original.equals(reverse)){
            printLn("String is palindrome");
        }else {
            printLn("String is not palindrome");
        }
    }
}
