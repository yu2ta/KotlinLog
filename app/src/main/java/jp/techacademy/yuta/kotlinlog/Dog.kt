package jp.techacademy.yuta.kotlinlog

import android.util.Log

open class Dog: Animal, Movable {
    constructor(name: String, age: Int): super(name, age) {
    }

    override fun say(){
        Log.d("kotlintest", this.name + this.age + "わんこわんこ")
    }

    override fun move() {
        Log.d("Kotlintest", this.name + " " + this.age + "歳は全力ダッシュ")
    }

}