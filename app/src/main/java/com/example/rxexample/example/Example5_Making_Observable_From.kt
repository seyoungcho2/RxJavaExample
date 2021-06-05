package com.example.rxexample.example

import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.fromArray(1,2,3).subscribe(::println)

    Observable.fromIterable(listOf(4,5,6)).subscribe(::println)

    Observable.fromCallable {
        Thread.sleep(1000)
        "Callable Executed"
    }.subscribe(::println)

    Observable.fromPublisher<String> {
        it.onNext("Hello")
        it.onNext("Kotlin")
    }.subscribe(::println)
}