package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите первое число: ");
            String numberString1 = reader.readLine();
            System.out.print("Введите второе число: ");
            String numberString2 = reader.readLine();
            int number1 = Integer.parseInt(numberString1);
            int number2 = Integer.parseInt(numberString2);
            System.out.println( "Наибольший общий делитель чисел " + number1 + " и "+ number2 + " равен " + nod(number1,number2));
            System.out.println("Наименьшее общее кратоное " + nok(number1,number2));

        }catch (NumberFormatException ex){
            System.out.println("Данные введены не верно");
        }

    }
     static int nod (int number1, int number2){
        if (number1 == 0)
            return number2;

        while (number2 != 0) {
            if (number1 > number2)
                number1 = number1 - number2;
            else
                number2 = number2 - number1;
        }

        return number1;
    }

    static int nok (int number1, int number2){
        int nok = (number1*number2)/nod(number1,number2);
        return nok;

    }
}
