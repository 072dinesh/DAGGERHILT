package com.example.daggerhilt.Demo

import android.util.Log
import javax.inject.Inject

class car @Inject constructor(private val engine: Engine, private val wheel: Wheel) {

    fun getCar(){
        engine.getEngine()
        wheel.getwheel()
        Log.d("main","car is running")
    }
}