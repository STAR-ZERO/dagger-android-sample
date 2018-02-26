package com.example.parameter.di

import android.app.Activity
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import com.example.parameter.activity.MainActivity
import com.example.parameter.fragment.MainFragment
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {

    // MainActivityをActivityの型として依存解決できるようにする
    // @Bindsは引数が一つのみ指定できて、その引数を戻り値の型としてそのまま返却する@Providesのようなもの

    @Binds
    abstract fun bindsActivity(activity: MainActivity): Activity

    // @Bindsではなく、@Providesを使う場合は以下のような感じ
    // abstract classなので、staticにしてあげる必要がある
    @Module
    companion object {

        // FragmentManagerを依存解決できるようにする
        // 外部からインスタンスを与えることができないので、渡されるMainActivityを使って取得する

        @JvmStatic
        @Provides
        fun providesFragmentManager(activity: MainActivity): FragmentManager {
            return activity.supportFragmentManager
        }
    }

    // FragmentでAndroidSupportInjection.inject(this)が使えるようにする

    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun contributeFirstFragment(): MainFragment

    // Fragmentで使うModule

    @Module
    abstract class MainFragmentModule {
        // FirstFragmentをFragmentの型として依存解決できるようにする
        //   MainFragmentViewModelではコンストラクタInjectでFragmentの型として受け取るため必要
        @Binds
        abstract fun bindsFragment(fragment: MainFragment): Fragment
    }
}