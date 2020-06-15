package com.company;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/6/6 0:15
 * @version: 1.0
 * @modified By:
 */
public class Utils {
    private int min = 0;
    private int max = 2;

    public Utils() {
    }

    public static int randomMonsterChop(int min, int max) {
        return (int)(Math.random() * (double)(max - min) + (double)min);
    }
}
