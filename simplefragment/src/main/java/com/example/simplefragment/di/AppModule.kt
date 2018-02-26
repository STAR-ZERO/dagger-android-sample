package com.example.simplefragment.di

import com.example.simplefragment.App
import com.example.simplefragment.db.Repo
import com.example.simplefragment.db.SampleRepo
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