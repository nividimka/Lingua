package kz.dkgroup.auth_firebase_impl.start

import kz.dkgroup.auth_api.AuthStarter
import kz.dkgroup.auth_firebase_impl.Screens
import kz.dkgroup.core.di.scope.Feature
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@Feature
class FirebaseAuthStarterImpl @Inject constructor(): AuthStarter {

    override fun startAuth(router: Router) {
        router.navigateTo(Screens.AuthFlow)
    }
}
