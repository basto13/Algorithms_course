package sem_1.homework.sem_1_tasks;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

// 1 Task. Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N.
// Согласно свойствам линейной сложности, количество итераций цикла будет линейно изменяться
// относительно изменения размера N.

// 2 Task. Написать алгоритм поиска простых чисел (делятся только на себя и на 1) в диапазоне от 1 до N.
// В алгоритме будет использоваться вложенный for, что явно говорит о квадратичной сложности

// 3 Task. Необходимо написать алгоритм поиска всех доступных комбинаций (посчитать количество)
// для 4 кубиков с количеством граней N.
//Данное решение имеет сложность O(n4), но если количество кубиков сделать переменной,
// то она трансформируется в O(nk),
//что будет представлять собой экспоненциальную сложность.

// 4 Task. Пишем алгоритм поиска нужного числа последовательности Фибоначчи.
//Считаем, что 1 и 2 значения последовательности равны 1.
//Искать будем по формуле On=On-1+On-2 что предполагает использовать рекурсивного алгоритма.  

// 5 Task. Необходимо сравнить скорость работы 2 алгоритмов вычисления чисел Фибоначчи и определить,
// какой из них работает быстрее.



import java.util.ArrayList;
import java.util.Date;

public class sem_1_tasks {
    public static int findSum(int number) {
        int sum = 0;
        int n = 5;
//        for (int i = 0; i <= n; i++) {
//            sum += i;
//        }
//            System.out.println("sum = " + sum);
        int sum2 = (n * (n + 1)) / 2;
        return sum2;
    }

    public static ArrayList<Integer> findPrimes(int number) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <= number; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) flag = false;
                break;
            }
            if (flag) result.add(i);
        }
        return result;
    }

    private static int findCubes(int k) {
        int result = 0;
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < k; l++) {
                    for (int m = 0; m < k; m++) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    ;

    private static int findFibonachi(int n) {
//        System.out.println(n);
        if (n <=2){
            return 1;
        }
        else{
            return findFibonachi(n-1) + findFibonachi(n-2);
        }
    }

    private static void findFibSecond(int number) {
        int first = 1;
        int second = 1;
        for (int i = 2; i < number; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        System.out.println(second);
    }

    public static void main(String[] args) {

        int number = 30;

        System.out.println("1 task");
        System.out.println(findSum(number));
        System.out.println("2 task");
        System.out.println(findPrimes(number));
        System.out.println("3 task");
        System.out.println(findCubes(6));
        System.out.println("4 task");
        Date start1 = new Date();
        System.out.println("fib is " + findFibonachi(number));
        Date stop1 = new Date();
        Date start2 = new Date();
        findFibSecond(number);
        Date stop2 = new Date();
        System.out.println("1 option: process time is " + (stop1.getTime() - start1.getTime()));
        System.out.println("2 option: process time is " + (stop2.getTime() - start2.getTime()));
    }


}
