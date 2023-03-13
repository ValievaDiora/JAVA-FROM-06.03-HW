import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // ЗАДАНИЕ БЕЗ *
       //0.  Перевести число 333 из шестнадцатиричной в десятичную.
       int number0 = 333;
       int result0 = (3*(16*16)) + (3*16) + (3*1);

        System.out.println(result0);

        //1.Разложить число 200345 на разряды в десятичной системе.
        int number1= 200345;
        int result1 = (2*(10*10*10*10*10)) + (3*(10*10)) + (4*10) + (5*1);

        System.out.println(result1);

        //2.Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10).
        int number2 = 637;
        int result2 = (6*(16*16)) + (3*16) + 7;

        System.out.println(result2);
        int numberr2 = 1591;
        int resultt2 = (1*(10*10*10)) + (5*(10*10)) +(9*10) + 1;

        System.out.println(resultt2);

        //3.Перевести 637 из десятичной в двоичную.
        int number3 = 637;
        String binary1 = Integer.toBinaryString(number3);

        System.out.println(binary1);

        //4. 11100111 перевести в десятичную.
        String binary2= "11100111";
        int number4 = Integer.parseInt(binary2, 2);

        System.out.println(number4);

        //5.Перевести 637 из десятичной в троичную.
        int number5 = 637;
        String binary3 = Integer.toString(number5, 3);

        System.out.println(binary3);







    }
}