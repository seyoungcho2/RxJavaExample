package com.example.rxexample.example

import io.reactivex.rxjava3.core.Observable

fun main() {
    val observable: Observable<Int> = Observable.fromArray(1, 2, 3)

    observable.subscribe { it ->
        println("first subscriber subscribed : ${it}")
    }

    observable.subscribe {
        println("second subscriber subscribed : ${it}")
    }
}