package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом do () while
*/

public class Task4 {

    public static void main(String[] args) {
        String s = "Sofiia";
        int a = 0;
        do {
            System.out.println(" ");
            a++;
            int b = 0;
            do {
                System.out.print( s + " ");
                b++;
            }

            while (b < 10);}

            while (a < 5) ;

    }
}