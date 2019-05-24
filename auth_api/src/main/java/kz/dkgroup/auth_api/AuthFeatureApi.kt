package kz.dkgroup.auth_api

interface AuthFeatureApi {

    fun authStarter(): AuthStarter

    fun authChecker(): AuthChecker

}
