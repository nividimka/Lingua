package kz.dkgroup.lingua.di

import android.content.Context
import kz.dkgroup.lingua.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {


    @Provides
    @Singleton
    fun provideContext(app: App) = app.applicationContext
    
}