package com.zlrx.functional;

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
