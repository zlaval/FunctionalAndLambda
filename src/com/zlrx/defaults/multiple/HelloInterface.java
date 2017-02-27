package com.zlrx.defaults.multiple;

public interface HelloInterface {

    default String hi() {
        return "hello";
    }

}
