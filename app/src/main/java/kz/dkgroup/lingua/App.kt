package kz.dkgroup.lingua

import kz.dkgroup.lingua.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import kz.dkgroup.lingua.di.DiConstants.GLOBAL
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.NavigatorHolder
import javax.inject.Inject
import javax.inject.Named

class App : DaggerApplication() {

//    @Inject
//    @Named(GLOBAL)
//    internal lateinit var navigatorHolder: NavigatorHolder
//
//    @Inject
//    @Named(GLOBAL)
//    internal lateinit var globalNavigator: Navigator

    override fun onCreate() {
        super.onCreate()
//        navigatorHolder.setNavigator(globalNavigator)
    }


    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }
}