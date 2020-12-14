package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите числа через пробел:"); //до 5 знаков, иначе
        String s = scan.nextLine();
        String[] strArr = s.split(" ");   //разделили пробелами для массива
        int[] numArr = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray(); //массив из целых чисел
        int[] counters = new int[numArr.length]; //создаем массив количеств
        int f = 0;
        for (String str : strArr) {
            char[] ch = str.toCharArray();          //переводим строку в массив чаров
            int count = 0;
            for (char c : ch) {
                count++;                            //считаем посимвольно
            }
            counters[f++] = count;                  //готовый массив количеств символов
        }
        Arrays.sort(numArr); //сортировка чисел
        Arrays.sort(counters); //сортировка счетчиков(количества символов)
        //System.out.println("в количествах символов " + Arrays.toString(counters));
        System.out.println("Самое короткое -> " + numArr[0]); //1 задание
        System.out.println("Самое длинное ->  " + numArr[numArr.length - 1]); //2 задание
        System.out.println("По возрастанию " + Arrays.toString(numArr)); //3 задание
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i] + " -> " + counters[i] + " симв"); //1 задание
        }
        System.out.println();
        System.out.println("Меньше средней:");
        for (int i = 0; i < numArr.length / 2; i++) {
            System.out.println(numArr[i] + " -> " + counters[i] + " симв"); //3 задание
        }
        System.out.println();
        System.out.println("Больше средней:");
        for (int i = numArr.length / 2; i < numArr.length; i++) {
            System.out.println(numArr[i] + " -> " + counters[i] + " симв"); //3 задание
        }
        {
            int a, b, c, d, e;
            for (int j : numArr)
                if ((j > 0) && (j < 100000)) {   //7 задание
                    a = j / 10000 % 10;
                    b = j / 1000 % 10;
                    c = j / 100 % 10;
                    d = j / 10 % 10;
                    e = j % 10;

                    if (a != b & a != c & b != a & b != c & d != a & d != b & d != c & e != a & e != b & e != c & e != d)
                        System.out.println("Все без одинаковых: " + j);
                }
        }
        {
            int a, b, c, d, e;
            for (int j : numArr)
                if ((j > 0) && (j < 100000)) {  //5 задание
                    a = j / 10000 % 10;
                    b = j / 1000 % 10;
                    c = j / 100 % 10;
                    d = j / 10 % 10;
                    e = j % 10;

                    if (a % 2 == 0 & b % 2 == 0 & c % 2 == 0 & d % 2 == 0 & e % 2 == 0)
                        System.out.println("Все символы четные: " + j);
                }
        }
        {
            int a, b, c, d, e;
            for (int j : numArr)
                if ((j > 0) && (j < 100000)) {  //6 задание
                    a = j / 10000 % 10;
                    b = j / 1000 % 10;
                    c = j / 100 % 10;
                    d = j / 10 % 10;
                    e = j % 10;

                    if (a <= b & b <= c & c <= d & d <= e)
                        System.out.println("Все возрастающие(посимвольно): " + j);

                }
        }

        {
            Matrixx m33 = new Matrixx(5, 5, 9);
            m33.DisplayMatrix();
            System.out.println("---");

            for (int i = 0;
                 i < 3; i++) {
                m33.rotateMatrix(90);
                System.out.println("---");
                m33.DisplayMatrix();

            }
        }
    }
}


