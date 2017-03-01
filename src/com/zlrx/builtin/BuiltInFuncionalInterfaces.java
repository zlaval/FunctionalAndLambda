package com.zlrx.builtin;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class BuiltInFuncionalInterfaces {

    private void supplierExample() {
        Supplier<String> supplier = () -> "hello";
        String hello = supplier.get();

        Supplier<Car> carSupplier = Car::new;
        Car car = carSupplier.get();

        Supplier<IntStream> intStremaSupplier = () ->
                IntStream.range(0, 100)
                        .filter(i -> i % 2 == 0)
                        .map(i -> i * 10);
    }

    private void predicateExample() {
        Predicate<Integer> evenIntPredicate = x -> (x & 1) == 0;
        evenIntPredicate.test(10);
        evenIntPredicate.test(11);

        Predicate<Integer> oddIntPredicate = evenIntPredicate.negate();
        oddIntPredicate.test(10);
        oddIntPredicate.test(11);
    }

    private void functionExamle() {

    }

    private void consumerExmaple() {

    }

    private void binaryOperatorExample() {

    }

    public static void main(String[] args) {
        BuiltInFuncionalInterfaces builtInFuncionalInterfaces = new BuiltInFuncionalInterfaces();
        builtInFuncionalInterfaces.predicateExample();
    }

}
