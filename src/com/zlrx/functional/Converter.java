package com.zlrx.functional;

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);

    /*    Forditasi hiba, ha convertAndFormat visszakerül a kódba
          a @FunctionalInterface annotacio nem engedi hogy
          egynel tobb abstract metódut tartalmazzon az interfae
     */
    //T convertAndFormat(F from);


}
