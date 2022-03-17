package jp.techacademy.yuta.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var satou = Human("佐藤", 38, "釣り")
        var tanaka = Human("田中", 34, "撮り鉄を撮る特殊な趣味")

        satou.say()
        satou.think()

        tanaka.say()
        tanaka.think()
    }

}