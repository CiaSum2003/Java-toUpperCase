
// 1.16
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        // .next excludes spaces in the input
            Scanner in = new Scanner(System.in);
            String user_word = in.next();
            in.close();
    // user_word is only used to traverse the array, upper_word is to transform the string
            int change_char = 0;
            char[] upper_word = user_word.toCharArray();
            for (int i = 0; i < user_word.length(); i++){

                if (Character.isLowerCase(upper_word[i])){
                    upper_word[i] = Character.toUpperCase(upper_word[i]);
                    change_char +=1;
                }
            }
            System.out.println(upper_word);
            System.out.println(change_char);

    }
}
