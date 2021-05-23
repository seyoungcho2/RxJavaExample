package com.example.rxexample.example

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.PublishSubject

fun main() {
    val publisher: PublishSubject<String> = PublishSubject.create()

    publisher.subscribe { it ->
        println(it)
    }

    publisher.onNext("count : 1")
    publisher.onNext("count : 2")
    publisher.onNext("count : 3")
}

