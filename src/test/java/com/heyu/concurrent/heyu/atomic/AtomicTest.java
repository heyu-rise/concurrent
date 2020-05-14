package com.heyu.concurrent.heyu.atomic;


import com.heyu.concurrent.heyu.StringTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author heyu
 * @date 2019/8/17
 */
public class AtomicTest {

    public static void main(String[] args) {
        AtomicReference<StringTest> atomicReference = new AtomicReference<>();

        List<String> a = new ArrayList<>();

        LinkedList<String> linkedList = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>(100);

    }
}
