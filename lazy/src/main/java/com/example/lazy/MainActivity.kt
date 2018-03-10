package com.example.lazy

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    // 通常のInject
    @Inject
    lateinit var modelBasic: SampleModel

    // Lazy<T>として宣言
    //   ※ kotlin.Lazyも存在するので、package名から記述
    @Inject
    lateinit var lazy: dagger.Lazy<SampleModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 任意のタイミングでコンストラクタインジェクションでインスタンスを生成
        val model1 = lazy.get()
        val model2 = lazy.get()

        // Lazy.getで取得したものは同一インスタンス
        Log.d("MainActivity", "model1 === model2: ${model1 === model2}")

        // 通常のInjectとLazy.getでは別インスタンス
        Log.d("MainActivity", "modelBasic === model1: ${modelBasic === model1}")
        Log.d("MainActivity", "modelBasic === model2: ${modelBasic === model2}")

        Log.d("MainActivity", "modelBasic: $modelBasic")
        Log.d("MainActivity", "model1: $model1")
        Log.d("MainActivity", "model2: $model2")
   }
}
