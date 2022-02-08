package com.katetaier11;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static final Random RANDOM = new Random();
    public static final int COUNT = 10;

    public static void main(String[] args) {

        /*1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
          Создать один или несколько конструкторов которые гарантирует что у каждого есть имя и фамилия.
          Создать список из 100 обьектов типа Person заполненных случайными данными (Например создать массив на
          несколько имен и выбирать из него случайным образом).
          Код который создает список Person и заполняет его данными разместить в другом классе, не в Person, например
          в PersonFactory.
          Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
          не было человека весом 3 кг и ростом 180 итд.*/

        PersonFactory factory = new PersonFactory();
        List<Person> personList = factory.pileupPersons(100);
        System.out.print(personList + "\n\n");

        /* Написать класс для работы с матрицами (2-мерными массивами), методы:
        print(int[][] matrix) - печатает матрицу
        swapColumns(int[][] matrix, i, j) - меняет 2 столбца местами
        swapRows(int[][] matrix, i, j) - меняет 2 рядка местами
        mul(int[][] matrix, int value) - умножает матрицу на число
        toArray(int[][] matrix) - превращает матрицу в массив. Например если была матрица на 3x4 то вернуть массив из 12
        max(int[][] matrix) - возвращает максимальный элемент матрицы
      */
        int[][] matrix = new int[COUNT][COUNT];
        System.out.print("The random matrix is:\n");
        Matrix.print(matrix);
        System.out.println();
        int i = 1;
        int j = 2;
        System.out.print("Let's swap two columns:\n");
        Matrix.swapColumns(matrix, i, j);
        System.out.println();
        System.out.print("Let's swap two rows:\n");
        Matrix.swapRows(matrix, i, j);
        System.out.println();
        System.out.print("Let's multiply its elements:\n");
        int value = RANDOM.nextInt(4) + 2;
        Matrix.multiplyMatrix(matrix, value);
        System.out.println();
        System.out.print("Let's turn it into one dimensional array:\n");
        System.out.print(Arrays.toString(Matrix.toArray(matrix)) + "\n\n");
        System.out.println("The maximal value of the matrix is: " + Matrix.max(matrix));
    }
}
