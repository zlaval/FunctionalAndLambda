package com.zlrx.functional;

public class FunctionalInterfaceUsecase {

    public static void main(String[] args) {
        Converter<Integer, String> converter0 = new Converter<Integer, String>() {
            @Override
            public String convert(Integer from) {
                return from.toString();
            }
        };

        Converter<Integer, String> converter1 = (Integer from) -> from.toString();

        Converter<Integer, String> converter2 = from -> from.toString();

        Converter<Integer, String> converter3 = Object::toString;

        printConverted(10, converter0);
        printConverted(10, converter1);
        printConverted(10, converter2);
        printConverted(10, converter3);
    }

    static void printConverted(int number, Converter<Integer, String> converter) {
        System.out.println(converter.convert(number));
    }

}
