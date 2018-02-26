package com.example.simpleapp.di

import com.example.simpleapp.App
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton


// AndroidInjectorでinject(T)が定義されていて、それがAppで使われてる

@Singleton
@Component(modules = [
    AppModule::class,
    ActivityModule::class
])
interface AppComponent : AndroidInjector<App> {

    // AndroidInjector.Builderをそのまま使ってる
    //   @BindsInstanceによってAppクラスを依存解決できるようになってる
    //   createメソッドが定義されている
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}
