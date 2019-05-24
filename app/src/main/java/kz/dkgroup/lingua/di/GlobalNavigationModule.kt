package kz.dkgroup.lingua.di

import javax.inject.Named
import javax.inject.Singleton

import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

import kz.dkgroup.lingua.di.DiConstants.GLOBAL


@Module
class GlobalNavigationModule {

    private val mCicerone: Cicerone<Router> = Cicerone.create()

    @Singleton
    @Provides
//    @Named(GLOBAL)
    fun provideRouter(): Router {
        return mCicerone.router
    }

    @Singleton
    @Provides
//    @Named(GLOBAL)
    fun provideNavigatorHolder(): NavigatorHolder {
        return mCicerone.navigatorHolder
    }

}
