package com.yethree.creating;

import io.reactivex.Observable;

import java.util.Arrays;

public class CreateExample {
    public static void main(String[] args) {
        just();

        from();

        fromIterable();
    }

    private static void just() {
        Observable.just("Hello", "RxJava2!!")
                .subscribe(System.out::println);
    }


    private static void from() {
        Observable.fromArray("seoul", "pusan", "incheon")
                .subscribe(System.out::println);
    }


    private static void fromIterable() {
        Observable.fromIterable(Arrays.asList("1st", "2nd", "3rd"))
                .subscribe(System.out::println);
    }
}
