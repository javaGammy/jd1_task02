import java.sql.SQLOutput;
import java.util.Scanner;

public class Decomposition {
    public static void getInfo() {
        calcSquare(3, 5, 6, 7, 5, 4);
        //calcNok2(28, 96);
        Decomposition.getFactOddNum();
        getQuadrangleSquare(1, 2, 3, 4);
        isNumbersTwin(100);

    }

    public static int getSum2(int a, int b) {
        //Находим сумму двух чисел
        int sum = a + b;
        return sum;
    }

    public static int getSum3(int a, int b, int c) {
        //Находим сумму трех чисел
        int sum = getSum2(a, b) + c;
        return sum;
    }


    public static int getMin2(int a, int b) {
        //Метод нахождения минимального из двух чисел
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }

    public static int getMin3(int a, int b, int c) {
        //Метод нахождения минимального из трех чисел
        int min;
        if (getMin2(a, b) < getMin2(b, c)) {
            min = getMin2(a, b);
        } else {
            min = getMin2(b, c);
        }
        return min;
    }


    public static int getMax2(int a, int b) {
        //Метод нахождения максимального из двух чисел
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static int getMax3(int a, int b, int c) {
        //Метод нахождения максимального из трех чисел
        int max;
        if (getMax2(a, b) > getMax2(b, c)) {
            max = getMax2(a, b);
        } else {
            max = getMax2(b, c);
        }
        return max;
    }

    public static int getMax4(int a, int b, int c, int d) {
        //Метод нахождения максимального из четырех чисел
        int max;
        if (getMax2(a, b) > getMax2(c, d)) {
            max = getMax2(a, b);
        } else {
            max = getMax2(c, d);
        }
        return max;
    }

    public static int calcNod2(int a, int b) {
        //Высчитываем НОД для 2 чисел
        int nod = 0;

        for (int i = getMax2(a, b); i < 0; i--) {
            if (a % i == 0 && b % i == 0) {
                nod = i;
                break;
            }
        }
        return nod;
    }

    public static int calcNod3(int a, int b, int c) {
        //Высчитываем НОД для 3 чисел
        int nod = 0;

        for (int i = getMax3(a, b, c); i < 0; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                nod = i;
                break;
            }
        }
        return nod;
    }



    public static double calcSquareEquilTri(double a) {
        //Нахождение площади равностороннего треугольника
        double squareTri;
        squareTri = (Math.sqrt(3) / 4) * Math.pow(a, 2);
        return squareTri;
    }



    public static double getDistBetweenPoint(double x1, double x2, double y1, double y2) {
        //Находим расстояние между двумя точками на плоскости
        double dist;
        dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return dist;
    }




    public static int getMaxArrayElement(int[] array) {
        //Получаем максимальный элемент массива
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;
    }



    public static boolean checkNumSimple2(int a, int b) {
        //Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
        boolean check = false;
        for (int i = getMax2(a, b); i < 0; i--) {
            if (a % i == 0 && b % i == 0) {
                check = false;
            } else {
                check = true;
            }
        }
        return check;
    }



    public static int calcFactorial(int a) {
        //Находим факториал числа
        int rez = 1;
        for (int i = 1; i <= a; i++) {
            rez = rez * i;
        }
        return rez;
    }


    public static double getQuadrangleHalfPerimeter(double x, double y, double z, double t) {
        //Находим полупериметр четырехугольника
        double square;
        square = (x + y + z + y) / 2;
        return square;
    }



    public static int getNumQuantity(int num) {
        //Получить количество цифр в числе
        int count = 0;
        int temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;

        }
        return count;
    }


    public static int getSumNumQuantity(int num) {
        //Метод нахождения суммы цифр числа
        int sum = 0;
        for (int i = 0; i < getNumQuantity(num); i++) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
        return sum;
    }

    public static boolean isCorrectVaulue(int num, int k, int n) {
        //Проверяем, подходит ли наше число под условие сумма цифр которых равна К и которые не большее N.
        if (getNumQuantity(num) == k && num < n) {
            return true;
        } else {
            return false;
        }
    }



    public static boolean isCorrectVaulue2(int k, int n) {
        //Проверяем, подходит ли наше число под условие Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
        if (checkNumSimple2(k, n) && (n - 2) == k) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isArmstrongsNum(int k) {
        //Является ли число числом Армстронга
        if (Math.pow(getSumNumQuantity(k), getSumNumQuantity(k)) == k) {
            return true;
        } else {
            return false;
        }
    }



    public static boolean isStrictlyIncreasing(int n) {
        //Выяснить, образуют ли цифры числа возрастающюю последовательность
        boolean check = true;
        int[] array = new int[n];
        array = getWriteArrayNum(array, n);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1] - 1) {
                check = false;
                break;
            }
        }
        return check;
    }


    public static boolean areAllnumbersNonDigit(int n){
        //Все ли цифры числа нечетные
        boolean check = true;
        int temp;
        temp = n;
        while (temp > 0){
            if ((temp % 10) % 2 == 0){
                check = false;
            } else {
                check = true;
            }

        }
        return check;
    }
    public static int getCountEvenNumb(int n) {
        //Определить сколько четных цифр в числе
        int count = 0;
        int temp = n;
        while (
                temp > 0) {
            if ((temp % 10) % 2 == 0)
                count++;
        }
        return count;
    }
    public static void calcSquare(double x1, double x2, double x3, double y1, double y2, double y3) {
        //Задача 1. Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.
        System.out.println("Задача 1. Площадь треугольника = [" + ((x1 - x3) * (y2 - y3) - (y1 - y3) * (x2 - x3)) + "]");
    }
    public static int calcNok2(int a, int b) {
        //Задача 2. Высчитываем НОK для 2 чисел
        int nok = (a * b) / calcNod2(a, b);
        return nok;
    }
    public static int calcNod4(int a, int b, int c, int d) {
        //Задача 3. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
        int nod = 0;
        for (int i = getMax4(a, b, c, d); i < 0; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0)
                nod = i;
            break;
        }
        return nod;
    }

    public static int calcNok3(int a, int b, int c) {
        //Задача 4. Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.
        int nok = (a * b * c) / calcNod3(a, b, c);
        return nok;
    }
    public static int getSumFromMax3(int a, int b, int c) {
        //Задача 5. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.
        int sum;
        sum = getSum2(getMax3(a, b, c), getMin3(a, b, c));
        return sum;
    }
    public static double calcSquareRegularHex(double a) {
        //Задача 6. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
        //треугольника.
        double squareHex = 6 * calcSquareEquilTri(a);
        return squareHex;
    }

    public static void getMaxDistBetweenPoint(int n) {
        //Задача 7. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из
        //пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
        double x1 = 0;
        double x2 = 0;

        double maxDist = 0;

        int[] xArray = new int[n];
        int[] yArray = new int[n];
        maxDist = getDistBetweenPoint(xArray[0], yArray[0], xArray[1], yArray[2]);

        for (int i = 0; i < xArray.length - 1; i++) {
            for (int j = i + 1; i < yArray.length; j++) {
                double distPoint = getDistBetweenPoint(xArray[i], yArray[i], xArray[j], yArray[j]);
                {
                    if (distPoint < maxDist) {
                        maxDist = distPoint;
                        x1 = xArray[i];
                        x2 = xArray[j];
                    }
                }
            }
            System.out.println(" (" + x1 + "," + x2 + ")");
        }
    }
    public static int getSecondLargeNum(int[] array) {
        //Задача 8. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
        //которое меньше максимального элемента массива, но больше всех других элементов).
        int max = getMaxArrayElement(array);
        int num = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < max && array[i] > array[i + 1]) {
                num = array[i];
            }
        }
        return num;
    }

    public static void checkNumSimple3(int a, int b, int c) {
        //Задача 9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
        for (int i = getMax3(a, b, c); i < 0; i--) {
            if (checkNumSimple2(a, b) && c % i == 0) {
                System.out.println("Числа не являются простыми");
            } else {
                System.out.println("Числа являются простыми");
            }
        }
    }

    public static void getFactOddNum() {
        //Задача 10. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                System.out.print(" " + calcFactorial(i));
            }
        }
    }

    public static void getSumSuccessively3(int[] array) {
        //Задача 11. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
        //Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
        //массива с номерами от k до m.
        int sum = 0;
        for (int i = 0; i < array.length - 2; i = i + 2) {
            sum += getSum3(array[i], array[i + 1], array[i + 2]);
            System.out.println(" " + sum);
        }

    }

    public static void getQuadrangleSquare(double x, double y, double z, double t) {
        //Задача 12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
        //если угол между сторонами длиной X и Y— прямой.
        double halfPerimetr = getQuadrangleHalfPerimeter(x, y, z, t);
        double square;
        square = Math.sqrt((halfPerimetr - x) * (halfPerimetr - y) * (halfPerimetr - z) * (halfPerimetr - t));
        System.out.println("Площадь четырехугольника = " + square);

    }

    public static int[] getWriteArrayNum(int[] array, int num) {
        //Задача 13. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются
        //цифры числа N.
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = num % 10;
            num /= 10;

        }
        return array;
    }

    public static void getMaxNumQuantity2(int a, int b) {
        //Задача 14.Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
        if (getNumQuantity(a) > getNumQuantity(b)) {
            System.out.println("В первом числе больше цифр");
        } else if (getNumQuantity(a) < getNumQuantity(b)) {
            System.out.println("Во втором числе больше цифр");
        } else {
            System.out.println("Одинаковое количество цифр");
        }
    }

    public static int[] getFormationArray(int k, int n) {
        //Задача 15. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
        //являют ся числа, сумма цифр которых равна К и которые не большее N.
        int mas[] = new int[n];

        int j = 0;
        for (int i = 1; i < n; i++) {
            if (isCorrectVaulue(i, k, n)) {
                mas[j] = i;
                j++;
            }
        }
        return mas;
    }

    public static void isNumbersTwin(int n) {
        //Задача 16. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). Найти
        //и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения
        //задачи использовать декомпозицию.
        for (int i = n; i <= 2 * n; i++) {
            if (isCorrectVaulue2(i, i + 2)) {
                System.out.println(i + " " + i + 1);
            }
        }
    }
    public static void getAmstrongsNum(int k) {
        //Задача 17. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная
        //в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать
        //декомпозицию.
        for (int i = 1; i < k; i++) {
            if (isArmstrongsNum(i)) {
                System.out.println(i);
            }
        }
    }

    public static void getNumStrictlyIncreasing() {
        //Задача 18.Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
        //(например, 1234, 5789). Для решения задачи использовать декомпозицию.
        int n = 3;
        for (int i = 100; i <= 999; i++) {
            if (isStrictlyIncreasing(i)) {
                System.out.println(" " + i);
            }

        }
    }
    public static void getSumOddNum(){
        //Задача 19. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить
        //также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
        int n = 3;
        int sum = 0;

        for (int i = 100; i <= 999; i++){
            if (areAllnumbersNonDigit(i)){
                sum += i;
                System.out.println("Сумма чисел" + sum +  " сумма цифр=" + getCountEvenNumb(i) );
            }
        }


    }


    public static int getCountSumNumb(int num) {
        //Задача 20. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
        //действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
        int count = 0;
        int temp;
        temp = num;

        do {
            temp -= getSumNumQuantity(num);
            count++;
        } while (temp != 0);
        return count;

    }


}







