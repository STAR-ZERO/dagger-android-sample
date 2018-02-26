package com.example.createmodule.di

import com.example.createmodule.db.Repo
import com.example.createmodule.db.SampleRepo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val name: String) {

    // 引数のLongはAppComponent.Builderのtimestampメソッドで定義（@BindsInstanceが指定されてるので可能になる）
    @Provides
    @Singleton
    fun provideRepo(timestamp: Long): Repo {
        return SampleRepo(name, timestamp)
    }
}
