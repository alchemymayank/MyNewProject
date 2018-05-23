import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number :");
        int no = scanner.nextInt();

        System.out.println("Square root is "+ findSquareRoot(no));
    }


    public static int findSquareRoot(int no){
        return no * no;
    }
}
