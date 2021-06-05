package com.example.rxexample.rxoperator

import io.reactivex.rxjava3.core.Observable

fun main(){
    Observable.range(1,10).scan { t1, t2 -> t1+t2 }.subscribe(::println)
}