package id.putraprima.mvvmlogin.viewmodels;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;


import id.putraprima.mvvmlogin.models.Login;

public class ViewModelLoginFactory implements ViewModelProvider.Factory {

    private Login Login;

    public ViewModelLoginFactory(Login Login){
        this.Login = Login;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(ViewModelLogin.class)){
            return (T) new ViewModelLogin(Login);
        }
        throw new IllegalArgumentException("Permintaan ViewModel ViewModelLogin");
    }
}
