package com.example.rxexample.rxoperator

import io.reactivex.rxjava3.core.Observable

fun main() {
    var count = 0
    Observable.range(1, 100).buffer(10).subscribe {
        count += 1
        println(it.fold("") { acc, i -> acc + i })
        println(count)
    } // buffer은 발행되는 값을들 합쳐서 List로 만든다.
}