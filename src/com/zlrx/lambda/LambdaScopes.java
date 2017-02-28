package com.zlrx.lambda;

import com.zlrx.functional.Converter;

public class LambdaScopes {

    private void localVariableScope() {
        int multiplyer = 10;
        Converter<Integer, String> multiplyedIntToStringConverter = from -> String.valueOf(from * multiplyer);
        multiplyedIntToStringConverter.convert(10);
        //forditasi hiba az alabbi sor engedelyezesenel
        //multiplyer++;
    }

    public static void main(String[] args) {
        LambdaScopes ls = new LambdaScopes();
        ls.localVariableScope();
    }

}
