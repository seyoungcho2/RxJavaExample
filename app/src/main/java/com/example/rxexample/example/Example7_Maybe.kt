package com.example.rxexample.example

import io.reactivex.rxjava3.core.Maybe

fun main() {
    /*
    Maybe는 한개를 발행 할 수도 안할 수도 있는 발행자
    */
    Maybe.create<Int> { emitter ->
        emitter.onSuccess(100)
        emitter.onSuccess(200)
    }.doOnSuccess {
        println("Success")
    }.subscribe(::println) // Success 출력 후 100 만 출력

    Maybe.create<Int> { emitter ->
        emitter.onComplete()
        emitter.onSuccess(100)
    }.doOnComplete {
        println("Completed")
    }.subscribe(::println) // Completed만 출력


}