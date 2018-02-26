package com.example.baseclass.di

import com.example.baseclass.App
import com.example.baseclass.db.Repo
import com.example.baseclass.db.SampleRepo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideRepo(app: App): Repo {
        return SampleRepo(app)
    }
}