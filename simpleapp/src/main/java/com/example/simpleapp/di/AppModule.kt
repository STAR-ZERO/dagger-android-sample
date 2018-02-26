package com.example.simpleapp.di

import com.example.simpleapp.App
import com.example.simpleapp.db.Repo
import com.example.simpleapp.db.SampleRepo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

// デフォルトコンストラクタしかない場合は、Daggerが自動でインスタンス作ってくれる
@Module
class AppModule {

    // 引数のAppはAppComponent.Builderの親のAndroidInjector.Builderに
    // 定義されている@BindsInstanceによって解決できるようになっている。
    // ただし、AndroidInjector.Builderに指定してるGenericsの型にあわせる（ContextやApplicationにするとビルドエラー）

    @Provides
    @Singleton
    fun provideRepo(app: App): Repo {
        return SampleRepo(app)
    }
}