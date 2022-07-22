package com.test.SynchronizedSortedStrings;

import lombok.AllArgsConstructor;

import java.util.concurrent.Callable;

@AllArgsConstructor
public class PrintNumsThread implements Callable<String> {

private int num;


    @Override
    public String call() {
        Thread.currentThread().setName("Thread "+num);
         String s =  num+" Thread "+num;
        System.out.println(s);
        return s;
    }


}
