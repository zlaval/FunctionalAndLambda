package com.zlrx.defaults.triangular;

import java.util.List;

public interface TriangularCalculator {

    List<Integer> getTriangularNumbers(int... numbers);

    default int calculateTriangularNumber(int n) {
        return n * (n + 1) / 2;
    }

}
