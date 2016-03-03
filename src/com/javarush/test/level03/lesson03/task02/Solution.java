package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        //напишите тут ваш код
        double a = convertEurToUsd(2, 1.8);
        double b = convertEurToUsd(68, 0.6);
        System.out.println(a);
        System.out.println(b);
    }

    public static double convertEurToUsd(int eur, double course){
        //напишите тут ваш код

        return eur * course;
    }
}
