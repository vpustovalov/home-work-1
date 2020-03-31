import java.util.Scanner;

public class Task2 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите целое первое число: ");
        int x = s.nextInt();
        System.out.println("Введите целое второе число: ");
        int y = s.nextInt();

        int z = x - y;
        System.out.println("Разницу двух чисел "+z);
    }
}
