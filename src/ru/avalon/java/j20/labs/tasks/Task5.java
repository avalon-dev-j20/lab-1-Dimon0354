package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Задание №5.
 *
 * <p>Тема: "Изучение отличия между списками и наборами".
 */
public class Task5 implements Task {

    /**
     * Фабрика, генерирующая массивы чисел случайного характера.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        final int[] arrayMine = arrayFactory.getInstance(20);
        
        //Специально для заполнения List-a и Set-а создаем массив Integer-ов
		Integer[] arrIntegerObjs = new Integer[arrayMine.length];
		for(int i = 0; i < arrayMine.length; i++) {
			arrIntegerObjs[i] = arrayMine[i];
		}
		
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();

        list.addAll(Arrays.asList(arrIntegerObjs));
        set.addAll(Arrays.asList(arrIntegerObjs));
        /**
         * TODO(Студент): Выполните задание №5
         *
         * 1. Проинициализируйте переменные list и set объектами
         *    подходящих классов.
         *
         * 2. В обе коллекции поместите элементы массива array.
         *
         * 3. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }
}
