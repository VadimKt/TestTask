package Task5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task5 {
    public static void main(String[] args) throws IOException {
        try {

            System.out.print("Введите последовательность чисел: ");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String[] numbers = bufferedReader.readLine().split(" ");

            if(numbers.length<=100) {
                int[] numbersInt = new int[numbers.length];

                for (int i = 0; i < numbers.length; i++) {
                    numbersInt[i] = Integer.parseInt(numbers[i]);
                }
                System.out.print("Найденные полиндромы: ");

                for (int i = 0; i < numbers.length; i++) {
                    if (chekedForPolindrome(numbersInt[i])) {
                        System.out.print(numbersInt[i] + " ");
                    }

                }
            }else {
                System.out.println("Превышена длина последовательности.");
            }

        }catch (NumberFormatException ex){
            System.out.println("Данные введены не верно");
        }


    }
    static boolean chekedForPolindrome(int inputNumber){
        int lastDigit, sum = 0, a;

        a = inputNumber;

        while(a > 0)
        {
            lastDigit = a%10;
            sum = (sum*10) + lastDigit;
            a = a/10;

        }

        if(sum == inputNumber)
            return true;
        else
           return false;

    }

}
