package com.example.rxexample.rxoperator

import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.just("1", "2", "a")
        .map { Integer.parseInt(it) }
        .subscribe(::println, ::println) // 1, 2, NumberFormatException


    Observable.just("1", "2", "a")
        .map { Integer.parseInt(it) }
        .onErrorReturn { -1 }
        .subscribe(::println, ::println) // 1, 2, -1

    Observable.just("1", "2", "a")
        .map { Integer.parseInt(it) }
        .onErrorResumeNext {
            Observable.just(4,5,6)
        }
        .subscribe(::println, ::println) // 1, 2, 4, 5, 6

    Observable.just("1", "2", "a")
        .map { Integer.parseInt(it) }
        .retry(2)
        .subscribe(::println, ::println) // 1, 2, 1, 2, 1, 2
}