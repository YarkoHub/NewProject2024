package homework_11;
//Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
//
//{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
//Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается
// в обычном порядке, а начиная с этого индекса в обратном:
//
//{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
//Еще одна перегрузка: метод принимает массив и булевый флаг.
// Если флаг == true -> печатает массив в обратном порядке Если флаг == false -> печатает массив в прямом порядке
public class Task_0_1 {
    public static void main(String[] args) {
        int[] num = {1, 4, 3, 6, 7};
        System.out.print(num);
        for (int i = num.length-1; i >= 0; i--) {
            System.out.print(num[i] + "");

        }
        System.out.print(num);

    }

}
