package kz.dkgroup.auth_firebase_impl.di;


import dagger.Binds;
import dagger.Module;
import kz.dkgroup.auth_api.AuthChecker;
import kz.dkgroup.auth_api.AuthStarter;
import kz.dkgroup.auth_firebase_impl.start.FirebaseAuthCheckerImpl;
import kz.dkgroup.auth_firebase_impl.start.FirebaseAuthStarterImpl;
import kz.dkgroup.core.di.scope.Feature;

@Module
public abstract class AuthFeatureModule {

//    @Feature
//    @Binds
//    public abstract ScannerRepository provideScannerRepository(ScannerRepositoryImpl scannerRepository);
//
//    @PerFeature
//    @Binds
//    public abstract ScannerInteractor provideScannerInteractor(ScannerInteractorImpl scannerInteractor);

    @Feature
    @Binds
    public abstract AuthStarter provideScannerStarter(FirebaseAuthStarterImpl scannerStarter);

   @Feature
    @Binds
    public abstract AuthChecker provideScannerStarter(FirebaseAuthCheckerImpl scannerStarter);

}
