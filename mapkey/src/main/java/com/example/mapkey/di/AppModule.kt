package com.example.mapkey.di

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class AppModule {

    // 定義した@MyColorKeyを使ってMapキーを指定
    @Provides
    @IntoMap
    @MyColorKey(MyColor.RED)
    fun provideColorRed(): String {
        return "赤"
    }

    @Provides
    @IntoMap
    @MyColorKey(MyColor.GREEN)
    fun provideColorGreen(): String {
        return "緑"
    }
}
