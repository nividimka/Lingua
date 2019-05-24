package kz.dkgroup.auth_api

import androidx.lifecycle.LiveData
import ru.terrakok.cicerone.Router

interface AuthChecker {
    fun isAuthorized():LiveData<Boolean>

    fun authRequired():Boolean
}
