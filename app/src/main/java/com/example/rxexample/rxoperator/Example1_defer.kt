package com.example.rxexample.rxoperator

import io.reactivex.rxjava3.core.Observable

fun main() {
    val observable = Observable.defer { Observable.just(System.currentTimeMillis()) }

    observable.subscribe(::println) // x

    Thread.sleep(3000)

    observable.subscribe(::println) // x+3000 과 약간의 호출시간(alpha)이 반영된 시간 출력
}