package kz.dkgroup.lingua.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import kz.dkgroup.lingua.AppActivity
import kz.dkgroup.lingua.di.scope.ActivityScope

@Module
abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [])
    internal abstract fun appActivity(): AppActivity
}