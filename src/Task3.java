import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Task3 {

        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            int x = s.nextInt();
            System.out.println("Введите второе число: ");
            int y = s.nextInt();
            System.out.println("Введите третье число: ");
            int z = s.nextInt();
            int[] age = {x, y, z};
            OptionalInt max = Arrays.stream(age).max();
            System.out.println(max.getAsInt() + " максимальное число!");

        }

    }

