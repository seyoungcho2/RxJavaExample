package com.example.rxexample.example

import io.reactivex.rxjava3.core.Single

fun main() {
    /*
    Single는 한개를 발행 해야만 하는 연산자
    */
    Single.create<Int> { emitter ->
        emitter.onSuccess(100)
    }.subscribe(::println)

    Single.just(200).subscribe(::println)

    val single = Single.just(300)

    val observable = single.toObservable()
}