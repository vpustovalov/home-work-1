import java.util.Scanner;

public class Task4 {

        public static void main(String args[])
        {
            int num;
            System.out.println("Введите целое число:");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();

            if ( num % 2 == 0 )
                System.out.println("число " + num + " четное");
            else
                System.out.println("число " + num + " нечетное");
        }
    }

