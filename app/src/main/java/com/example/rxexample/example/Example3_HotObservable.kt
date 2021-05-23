package com.example.rxexample.example

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.PublishSubject

fun main() {
    val publisher: PublishSubject<Int> = PublishSubject.create()

    publisher.onNext(1)

    publisher.subscribe { it ->
        println("first subscriber subscribed : ${it}")
    }

    publisher.onNext(2)

    publisher.subscribe { it ->
        println("second subscriber subscribed : ${it}")
    }

    publisher.onNext(3)
}

