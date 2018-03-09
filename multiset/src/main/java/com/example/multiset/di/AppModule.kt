package com.example.multiset.di

import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.IntoSet

@Module
class AppModule {

    // @IntoSetによって戻り値がSetの1要素としてInjectされる

    @Provides
    @IntoSet
    fun provideOneString(): String {
        return "ABC"
    }

    // @ElementsIntoSetでSetの要素を複数Injectできる

    @Provides
    @ElementsIntoSet
    fun provideSeveralString(): Set<String> {
        return setOf("DEF", "GHI")
    }
}