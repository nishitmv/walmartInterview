package com.test.SynchronizedSortedStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class PrintInorder {


    public void printIntegersSychronizedRoundRobin(int k, int numTimes) throws InterruptedException {

        for (int j = 0; j < numTimes; j++) {
            List<Callable<String>> list = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                list.add(new PrintNumsThread(i));
            }
            ExecutorService exec = Executors.newFixedThreadPool(k);
            List<Future<String>> futures = exec.invokeAll(list);

            futures.forEach(stringFuture -> {
                try {
                    stringFuture.get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }
}
