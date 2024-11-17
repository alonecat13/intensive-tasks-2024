package com.walking.intensive.chapter1.task1;

import javax.swing.*;

/**
 * Реализуйте метод getAgeString(), который будет принимать параметром целое число (возраст) и возвращать строку
 * вида: "Вам N лет". Программа должна учитывать правила русского языка.
 *
 * <p>Пример верного исполнения кода: "Вам 5 лет", "Вам 4 года".
 * Пример неверной работы программы: "Вам 14 года".
 *
 * <p>Также необходимо учесть негативные сценарии. Например, попытку передать в метод невалидное значение - например,
 * отрицательное число. В таких случаях ожидается, что метод вернет строку "Некорректный ввод".
 *
 * <p><a href="https://github.com/KFalcon2022/intensive-tasks-2024/blob/master/README.md">Требования к оформлению</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 102;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String AgeSuffix = "";
        if (age < 0 || age > 120) {
            AgeSuffix = "Так не бывает!!!";
        }

        if ((age % 10 == 1) && (age % 100 != 11)) {
            AgeSuffix = "Вам " + age + " год god";
        }

        if (age % 10 >= 2){// && age % 10 <= 4 && age <= 12 && age >= 14) {
            AgeSuffix = "Вам " + age + " года goda";
        } else {
            AgeSuffix = "Вам " + age + " лет let";
        }
        return AgeSuffix;
    }
}
