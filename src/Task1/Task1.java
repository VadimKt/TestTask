package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        try {
            System.out.println("Введите число: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String numberString = reader.readLine();
            int number = Integer.parseInt(numberString);

            if((number % 2)==0){
                System.out.print("Число "+number+" четное");
            }
            else {
                System.out.print("Число "+number+" не четное");
            }
            if(isSimpleNumber(number)== true){
                System.out.println(" и простое");
            }
            else {
                System.out.println(" и составное");
            }


        }catch (NumberFormatException ex){
            System.out.println("Данные введены не верно");
        }


    }
    static boolean isSimpleNumber(int number) {
        if (number == 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}

