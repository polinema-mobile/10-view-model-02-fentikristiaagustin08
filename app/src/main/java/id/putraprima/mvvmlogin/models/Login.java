package id.putraprima.mvvmlogin.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Login implements Parcelable {
    String password="aliza";
    String username ="alizarizqi@gmail.com";

    public Login(){

    }
    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.password);
        dest.writeString(this.username);
    }

    protected Login(Parcel in) {
        this.password = in.readString();
        this.username = in.readString();
    }

    public static final Creator<Login> CREATOR = new Creator<Login>() {
        @Override
        public Login createFromParcel(Parcel source) {
            return new Login(source);
        }

        @Override
        public Login[] newArray(int size) {
            return new Login[size];
        }
    };
}