package com.example.rxexample.rxoperator

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    Observable.range(1, 5).subscribe(::println) // 1부터 5까지 출력

    Observable.range(1, 5).map { it * 10 }.subscribe(::println) // 10, 20, 30 .. 100 출력

    Observable.timer(100, TimeUnit.MILLISECONDS).subscribe{
        println("아이템 발행됨")
    } // 1개만 발행되고 끝난다.
    Thread.sleep(1000)

}