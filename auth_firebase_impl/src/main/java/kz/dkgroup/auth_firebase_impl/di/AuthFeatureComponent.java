package kz.dkgroup.auth_firebase_impl.di;


import dagger.Component;
import kz.dkgroup.auth_api.AuthFeatureApi;
import kz.dkgroup.auth_firebase_impl.AuthFragment;
import kz.dkgroup.core.di.scope.Feature;

@Component(modules = {
    AuthFeatureModule.class,
//    ScreenNavigationModule.class
}, dependencies = AuthFeatureDependencies.class)
@Feature
public abstract class AuthFeatureComponent implements AuthFeatureApi {

    private static volatile AuthFeatureComponent sScannerFeatureComponent;

    public static AuthFeatureApi initAndGet(AuthFeatureDependencies authFeatureDependencies) {
        if (sScannerFeatureComponent == null) {
            synchronized (AuthFeatureComponent.class) {
                if (sScannerFeatureComponent == null) {
                    sScannerFeatureComponent = DaggerAuthFeatureComponent.builder()
                        .authFeatureDependencies(authFeatureDependencies)
                        .build();
                }
            }
        }
        return sScannerFeatureComponent;
    }

    public static AuthFeatureComponent get() {
        if (sScannerFeatureComponent == null) {
            throw new RuntimeException("You must call 'initAndGet(ScannerFeatureDependenciesComponent scannerFeatureDependenciesComponent)' method");
        }
        return sScannerFeatureComponent;
    }

    public void resetComponent() {
        sScannerFeatureComponent = null;
    }

    public abstract void inject(AuthFragment scannerActivity);

    public abstract ScannerScreenComponent scannerScreenComponent();

    @Component(dependencies = {
//        CoreUtilsApi.class,
//        CoreNetworkApi.class,
//        CoreDbApi.class,
//        PurchaseFeatureApi.class
    })
    @Feature
    interface AuthFeatureDependenciesComponent extends AuthFeatureDependencies { }

}
