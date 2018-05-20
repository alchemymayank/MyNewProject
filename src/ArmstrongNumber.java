public class ArmstrongNumber extends Models {

    /*
    Armstrong Number in Java: A positive number is called armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
    Let's try to understand why 153 is an Armstrong number.
    153 = (1*1*1)+(5*5*5)+(3*3*3)
    where:
    (1*1*1)=1
    (5*5*5)=125
    (3*3*3)=27
    So:
    1+125+27=153
     */

    public void checkArmstrongNumber(int number){
        int temp,a,c = 0;
        temp = number;
        while(number>0){
            a= number%10;
            number = number/10;
            c = c+(a*a*a);
        }
        if (temp == c){
            printLn("Number is Armstrong Number");
        }else {
            printLn("Number is not Armstrong");
        }
    }
}
