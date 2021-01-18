package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) throws IOException {

        System.out.print("Введите текст: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String textString = reader.readLine();

        String[] text = textString.split(" ");
        System.out.println("Колличество слов в предложении: " + text.length);
        ArrayList<String> strings = new ArrayList<>( Arrays.asList(text));


        strings.sort(String::compareTo);

        for(String sq :strings){
            String s1=sq.substring(0,1);
            sq = sq.replaceFirst(s1,s1.toUpperCase());
            System.out.println(sq);
        }

    }
}
