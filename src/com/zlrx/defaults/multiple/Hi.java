package com.zlrx.defaults.multiple;

public class Hi implements GreetingInterface, HelloInterface {

    @Override
    public String hi() {
        return "hello";
    }
}
