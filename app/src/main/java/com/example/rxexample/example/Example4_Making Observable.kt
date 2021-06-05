package com.example.rxexample.example

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.ObservableEmitter

fun main() {
    val createDataSource = Observable.create { emitter: ObservableEmitter<Int> ->
        emitter.onNext(1)
        emitter.onNext(2)
        emitter.onNext(3)
        emitter.onError(Throwable())
    }

    createDataSource.subscribe(
        { println(it) }, // onNext
        { println("Error Ocurred") } // onError
    )

    val justDataSource = Observable.just(1, 2, 3, Throwable("Throwable published"))
    // Throwable 발행은 애러로 안쳐진다.

    justDataSource.subscribe(::println)
}