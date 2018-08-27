
import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> names;
        names = new ArrayList<>(Arrays.asList("AMELIA", "OLIVER", "JESSICA", "GEORGE", "SCARLETT", "JOSEPH", "FLORENCE", "ALEXANDER"));
        namesWithStartLetter(names, 'O');
    }

    private static void namesWithStartLetter(ArrayList<String> str, char a) {
        for (String i : str) {
            if (i.charAt(0) == a)
                System.out.println(i);

        }
    }
}
