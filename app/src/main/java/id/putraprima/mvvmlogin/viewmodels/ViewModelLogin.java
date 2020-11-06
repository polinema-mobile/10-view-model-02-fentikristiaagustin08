package id.putraprima.mvvmlogin.viewmodels;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import id.putraprima.mvvmlogin.models.Login;

public class ViewModelLogin extends ViewModel{
    private MutableLiveData<Login> loginMutableLiveData = new MutableLiveData<>();
    private Login Login;

    public String username, password;

    public ViewModelLogin(Login Login){
        this.Login = Login;
        this.loginMutableLiveData.setValue(this.Login);

    }

    public boolean isLogin(){
        if(username.equals(Login.getUsername()) && password.equals(Login.getPassword())){
            return true;
        }else{
            return false;
        }
    }
    public LiveData<Login> LoginLiveData(){
        return loginMutableLiveData;
    }
}



