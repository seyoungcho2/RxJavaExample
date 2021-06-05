package com.example.rxexample.rxoperator

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    val observable = Observable.interval(100, TimeUnit.MILLISECONDS)

    observable.subscribe(::println)

    Thread.sleep(2000)
}