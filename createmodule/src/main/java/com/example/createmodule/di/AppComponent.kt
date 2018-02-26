package com.example.createmodule.di

import com.example.createmodule.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    ActivityModule::class
])
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>() {
        // 引数を作りたいModuleにして、自分(Builder)を返すようにすることで、
        // Componentを作るときに、Moduleのインスタンスが渡せるようになる
        abstract fun appModule(appModule: AppModule): Builder

        // @BindsInstanceを指定するとModuleのメソッド引数に渡すことができる
        @BindsInstance
        abstract fun timestamp(timestamp: Long): Builder
    }
}
