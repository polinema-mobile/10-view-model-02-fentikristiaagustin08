package id.putraprima.mvvmlogin.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import id.putraprima.mvvmlogin.models.Login;

public class ViewModelHome extends ViewModel {
    private MutableLiveData<Login> homeMutableLiveData = new MutableLiveData<>();
    private Login Login;

    public ViewModelHome(Login modelLogin){
        this.Login = Login;
        this.homeMutableLiveData.setValue(Login);
    }
    public LiveData<Login> LoginLiveData(){
        return homeMutableLiveData;
    }
}
