package com.example.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerhilt.Demo.Main

import com.example.daggerhilt.Demo.car
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    //lateinit var car: car
    //lateinit var main: Main
    lateinit var main: Main
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //car.getCar()
        main.getName()
    }
}