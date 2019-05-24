package kz.dkgroup.auth_firebase_impl.start

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

import kz.dkgroup.auth_api.AuthChecker

class FirebaseAuthCheckerImpl : AuthChecker {
    override fun isAuthorized(): LiveData<Boolean> {
        return MutableLiveData()
    }

    override fun authRequired(): Boolean {
        return false
    }
}
