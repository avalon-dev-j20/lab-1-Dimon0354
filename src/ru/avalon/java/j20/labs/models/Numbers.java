package ru.avalon.java.j20.labs.models;

import java.util.Arrays;
import java.util.TreeSet;

public final class Numbers {

    /**
     * Скрытый конструктор, чтобы предотвратить создание
     * экземпляров данного типа.
     */
    private Numbers() {}

    /**
     * Выполняет поиск среднего арифметического заданного
     * массива чисел.
     *
     * @param array массив значений
     * @return среднее арифметическое с точностью до типа {@code double}.
     */
	public static <T extends Number> double avg(T[] array) {
		
		double result = array[0].doubleValue();
		for(int i = 1; i < array.length; i++) {
			 result += array[i].doubleValue();
		 }
		
		return result/array.length;
	}

    /**
     * Выполняет поиск максимального значения в массиве.
     *
     * @param values массив значений
     * @return максимальное значение массива
     */
	public static <T extends Number> int max(T[] array) {
		int resultMax = 0;
		TreeSet<Number> sortSet = new TreeSet<>();
		sortSet.addAll(Arrays.asList(array));
		System.out.println("MaxAndMin.max() sortSet = " + sortSet);
		resultMax = sortSet.last().intValue();
		return resultMax;
	}

    /**
     * Выполняет поиск минимального значения массива.
     *
     * @param values массив значений
     * @return минимальное значение массива
     */
	public static <T extends Number> int min(T[] array) {
		int resultMin = 0;
		TreeSet<Number> sortSet = new TreeSet<>();
		sortSet.addAll(Arrays.asList(array));
		System.out.println("MaxAndMin.max() sortSet = " + sortSet);
		resultMin = sortSet.first().intValue();
		return resultMin;
	}
}
