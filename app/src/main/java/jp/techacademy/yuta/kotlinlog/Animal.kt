package jp.techacademy.yuta.kotlinlog

import android.util.Log

abstract class Animal {
    var name: String
    var age: Int

    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }

    abstract fun say()
}