package com.grepp.basic.g_class;

public class Run {

    public static void main(String[] args) {
        Coffee coffee = new Coffee(
            "americano",
            1000,
            500,
            10,
            3,
            0,
            'T',
            false
        );
    }
}
// 객체에는 항상 this 라는 메모리 주소를 담는 공간이 존재?