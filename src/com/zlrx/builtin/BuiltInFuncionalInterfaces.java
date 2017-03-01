package com.zlrx.builtin;

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


}
