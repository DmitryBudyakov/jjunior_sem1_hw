package sem1.hw.task1;

import java.util.Arrays;
import java.util.List;
/*
    Задание 1
    Напишите программу, которая использует Stream API для обработки списка чисел.
    Программа должна вывести на экран среднее значение всех четных чисел в списке.
 */
public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Список: " + list);

        double avg =
                list.stream()
                        .filter(n -> n % 2 == 0)
                        .mapToInt(Integer::intValue)
                        .average().getAsDouble();
        System.out.println("Среднее значение всех четных чисел: " + avg);

    }
}
