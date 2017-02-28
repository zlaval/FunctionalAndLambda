package com.zlrx.defaults.triangular;

import java.util.ArrayList;
import java.util.List;

public class TriangularNumberCalculatorImpl implements TriangularNumberCalculator {

    @Override
    public List<Integer> getTriangularNumbers(int... numbers) {
        List<Integer> result = new ArrayList<>(numbers.length);
        for (int n : numbers) {
            int triangular = calculateTriangularNumber(n);
            result.add(triangular);
        }
        return result;
    }

    public static void main(String[] args) {
        TriangularNumberCalculator tc = new TriangularNumberCalculatorImpl();
        List<Integer> triangularValues = tc.getTriangularNumbers(20, 30, 40, 50);
        System.out.println(triangularValues);
    }
}
