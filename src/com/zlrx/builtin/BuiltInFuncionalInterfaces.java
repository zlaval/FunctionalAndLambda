package com.zlrx.builtin;

import com.zlrx.builtin.pojo.Car;
import com.zlrx.builtin.pojo.FullName;

import java.util.LinkedList;
import java.util.List;
import java.util.function.*;
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
        Function<FullName, String> concatName = fullName -> fullName.getForename() + " " + fullName.getSurname();
        functionTest(concatName);
        Function<FullName, String> jutSurName = FullName::getSurname;
        functionTest(jutSurName);
    }

    private void functionTest(Function<FullName, String> fun) {
        List<FullName> names = new LinkedList<>();
        names.add(new FullName("Gipsz", "Jakab"));
        names.add(new FullName("Tóth", "Erik"));
        names.add(new FullName("Tóth", "Alex"));
        System.out.println("===========================");
        for (FullName fn : names) {
            System.out.println(fun.apply(fn));
        }
        System.out.println("===========================");
    }

    private void consumerExmaple() {
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("hello világ");
    }

    private void binaryOperatorExample() {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        binaryOperator.apply(3, 5);
    }

}
