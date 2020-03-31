import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {
        int[] array = {1, 5, 4, 3, 7};
        System.out.println("Числа в массиве "+ Arrays.toString(array));
        int sum = Arrays.stream(array).sum();
        System.out.println("Сумма всех чисел "+ sum);

    }
}

