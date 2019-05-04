package ru.avalon.java.j20.labs.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Модель получения последовательности чисел Фибоначчи.
 *
 * <p>Числа Фибонааччи (иногда пишут Фибона́чи[1]) — элементы
 * числовой последовательности 0, 1, 1, 2, 3, 5, 8, 13, 21,
 * 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181,
 * 6765, 10946, 17711, … (последовательность A000045 в OEIS),
 * в которой первые два числа равны либо 1 и 1, либо 0 и 1,
 * а каждое последующее число равно сумме двух предыдущих
 * чисел. Названы в честь средневекового математика Леонардо
 * Пизанского (известного как Фибоначчи).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%A4%D0%B8%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D0%B8">Числа Фибоначчи</a>
 */
public class Fibonacci implements Iterable<Integer> {
	public Fibonacci() {	
	}
	
	public int amotOfNumbers;
	public List<Integer> fibNumbersColl;
	
	void FibonaciCreatorFarm() {
		
		if(amotOfNumbers > 0) {
			
			fibNumbersColl = new ArrayList<Integer>();
			fibNumbersColl.add(0, 0);
			fibNumbersColl.add(1, 1);
			
			for (int i = 2; i < amotOfNumbers; i++) {
				
				int curNumbForWriting = fibNumbersColl.get(i-1) + fibNumbersColl.get(i-2);
				fibNumbersColl.add(i, curNumbForWriting);
				
			}
		}
	}
	
	public Fibonacci(int fibNumbersCnts) {
		
		this.amotOfNumbers = fibNumbersCnts;
		FibonaciCreatorFarm();
		
	}
	
	public Fibonacci(int amotOfNumbers, List<Integer> fibNumbersColl) {
		
		this.amotOfNumbers = amotOfNumbers;
		this.fibNumbersColl = fibNumbersColl;
		FibonaciCreatorFarm();
		
	}
	
	public int FibonacciCollSum() {
		
		int result = 0;
		Iterator<Integer> iterator = fibNumbersColl.iterator();
		
		while(iterator.hasNext()) {
			int sum = 0;
			sum += iterator.next();
			result = sum;
		}
		return result;
	}
    /**
     * Итератор, выполняющий обход последовательности
     * чисел Фибоначчи.
     */
    private class FibonacciIterator implements Iterator<Integer> {

    	int indexFib = 0;
        /**
         * Определяет, есть ли следующее значение
         * последовательности чисел Фибоначчи.
         *
         * @return {@code true}, если следующее число
         * последовательности существует. В обратном случае
         * {@code false}.
         */
        @Override
        public boolean hasNext() {
        	
        	if(indexFib < amotOfNumbers && fibNumbersColl.get(indexFib) != null) {
        		return true;
        	} else
        		return false;
        }

        /**
         * Возвращает следующее число последовательности
         * чисел Фибоначчи.
         *
         * @return следующее число последовательности.
         */
        @Override
        public Integer next() {
        	
           if(hasNext() == false) {
        	   
        	   throw new NoSuchElementException();
        	   
           } else {
        	   
        	   return fibNumbersColl.get(indexFib++);
           } 
        }
    }

    /**
     * Возвращает итератор, позволяющий выполнить обход
     * последовательности чисел Фибоначчи.
     *
     * @return итератор последовательности чисел Фибоначчи
     */
    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }
}
