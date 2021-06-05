package com.example.rxexample.rxoperator

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    Observable.interval(100, TimeUnit.MILLISECONDS)
        .debounce(90, TimeUnit.MILLISECONDS)
        .subscribe(::println)

    Observable.just(1, 200, 3, 400, 5)
        .filter { it > 100 }
        .subscribe(::println)

    Observable.just(1, 2, 3, 4, 5)
        .skip(2)
        .subscribe(::println)

    Observable.just(1, 2, 3, 4, 5)
        .take(2)
        .subscribe(::println)

    Observable.just(1, 2, 3, 4, 5)
        .all { it > 0 }
        .subscribe(::println)
}