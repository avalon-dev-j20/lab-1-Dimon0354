package ru.avalon.java.j20.labs.models;

/**
 * Модель представления о точке.
 */
public class Point {
    /**
     * Абсцисса точки.
     */
    private final Number x;
    /**
     * Ордината точки.
     */
    private final Number y;

    /**
     * Основной конструктор класса.
     *
     * @param x абсцисса точки
     * @param y ордината точки
     */
    public Point(float x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает абсциссу точки.
     *
     * @return x-координата точки.
     */
    public Number getX() {
        return x;
    }

    /**
     * Возвращает ординату точки.
     *
     * @return y-координата точки.
     */
    public Number getY() {
        return y;
    }

    /**
     * Возвращает дистанцию от точки до точки.
     *
     * @param point точка, до которой следует вычислить
     *              дистанцию.
     * @return дистанция между точками
     */
    public double distanceTo(Point point) {
    	double dx = x.doubleValue() - point.x.doubleValue();
    	double dy = y.doubleValue() - point.y.doubleValue();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
