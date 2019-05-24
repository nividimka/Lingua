package kz.dkgroup.auth_firebase_impl

import ru.terrakok.cicerone.android.support.SupportAppNavigator
import ru.terrakok.cicerone.android.support.SupportAppScreen

object Screens{
    object AuthFlow : SupportAppScreen(){
        override fun getFragment() = AuthFragment()
    }
}