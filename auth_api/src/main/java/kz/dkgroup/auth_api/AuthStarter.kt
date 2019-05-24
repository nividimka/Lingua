package kz.dkgroup.auth_api

import ru.terrakok.cicerone.Router

interface AuthStarter {
    fun startAuth(router: Router)
}
