package com.example.provider

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject
import javax.inject.Provider

class MainActivity : DaggerAppCompatActivity() {

    // 通常のInject
    @Inject
    lateinit var modelBasic: SampleModel

    // Provider<T>として宣言
    @Inject
    lateinit var provider: Provider<SampleModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 任意のタイミングでコンストラクタインジェクションでインスタンスを生成
        val model1 = provider.get()
        val model2 = provider.get()

        // すべてインスタンスが異なる
        Log.d("MainActivity", "model1 === model2: ${model1 === model2}")
        Log.d("MainActivity", "modelBasic === model1: ${modelBasic === model1}")
        Log.d("MainActivity", "modelBasic === model2: ${modelBasic === model2}")

        Log.d("MainActivity", "modelBasic: $modelBasic")
        Log.d("MainActivity", "model1: $model1")
        Log.d("MainActivity", "model2: $model2")
    }
}
