package com.zlrx.defaults.multiple;

public interface GreetingInterface {

    default String hi() {
        return "hello";
    }

}
