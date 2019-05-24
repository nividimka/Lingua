package kz.dkgroup.auth_firebase_impl.di;


import dagger.Subcomponent;
import kz.dkgroup.auth_firebase_impl.presentation.AuthPresenter;
import kz.dkgroup.core.di.scope.Screen;

@Subcomponent
@Screen
public interface ScannerScreenComponent {

    AuthPresenter scannerPresenter();

}
