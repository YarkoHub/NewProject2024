package homework_2;

import java.util.Random;

public class Task4 {

    public static void main(String[] args) {
        // x % 5 -> () целая часть может быть любой. [0... inf); дробная часть
        // (0, 1, 2, 3, 4) -> [0, x-1]

        // 2 -> 0, 1 - в остатке
        // 3 -> 0, 1, 2 - в остатке

        Random random = new Random(); // инструмент для генерации псевдослучайных чисел
        int rand = random.nextInt(10); // получаем случайное число в диапазоне от 0 до 9 включительно
        System.out.println("rand: " + rand);
        System.out.println(rand % 3);

        // Четные числа -> число, которое делится на 2 без остатка (кратное 2)
        int x;
//        x % 2 -> остаток 0? - четное, остаток равен 1 (не равен 0) -> не четное



    }

}
