package lesson1;

/**
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */
public class Task5 {
    public static void main(String[] args) {
        //System.out.println(reverse("Hello world!!!"));
        String s = "Hello world!!!";
        String rev = reverse(s);
        System.out.print(rev);
    }

    static String reverse(String input) {

        String rev = "";
        for (int i = input.length() - 1;  i>=0; i--)  {
            rev = rev + input.charAt(i);
        }
        return rev;
    }
}