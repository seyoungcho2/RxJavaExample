package com.example.rxexample.example

import io.reactivex.rxjava3.core.Completable

fun main(){
    Completable.create { emitter ->
        emitter.onComplete()
    }.subscribe(
        { println("completed") },
        { println("Error") }
    )

    Completable.create { emitter ->
        emitter.onError(Throwable())
    }.subscribe(
        { println("completed") },
        { println("Error") }
    )
}