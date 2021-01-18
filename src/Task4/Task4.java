package Task4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Task4 {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите текст: ");
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        String [] text =bufferedReader.readLine().split(" ");
        String word = bufferedReader.readLine();
        int n = 0;

        for (int i = 0; i < text.length; i++) {
            if (text[i].equalsIgnoreCase(word)){
                n++ ;
            }
        }
        System.out.println("Слово повторяется " + n + " раз(а).");


    }
}
