package com.wjk;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName Test
 * @Description
 * @Author Wangjunkai
 * @Date 2021/4/21 22:08
 **/

public class Test {
   static ExecutorService executorService = Executors.newFixedThreadPool(1);

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.out.println("run shutdown");
                executorService.shutdown();
                System.out.println("run over");
            }
        });
    }

    public static void main(String[] args) {
        executorService.execute(() -> {
            while(true){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("running");
            }
        });
    }

}