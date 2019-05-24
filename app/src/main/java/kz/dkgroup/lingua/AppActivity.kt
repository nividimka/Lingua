package kz.dkgroup.lingua

import android.content.Context
import android.os.Bundle

import javax.inject.Inject

import dagger.android.support.DaggerAppCompatActivity
import kz.dkgroup.lingua.di.DiConstants.GLOBAL
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import javax.inject.Named

class AppActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var context: Context
    lateinit var navigator:Navigator
    @Named(GLOBAL)
    @Inject
    internal lateinit var navigatorHolder: NavigatorHolder
    @Inject
//    @Named(GLOBAL)
    lateinit var router: Router
    private val currentFragment: androidx.fragment.app.Fragment?
        get() = supportFragmentManager.findFragmentById(R.id.container)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)
        navigator = SupportAppNavigator(this, supportFragmentManager, R.id.container)
//        FeatureProxyInjector.getFeatureAuth().firebaseAuthStarter().startAuth(router)
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()
        navigatorHolder.removeNavigator()
    }
}
