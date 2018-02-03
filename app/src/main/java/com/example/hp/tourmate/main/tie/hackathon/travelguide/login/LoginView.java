package com.example.hp.tourmate.main.tie.hackathon.travelguide.login;

/**
 * Created by HP on 2/3/2018.
 */

public interface LoginView {

    void rememberUserInfo(String id, String name, String num);

    void startMainActivity();

    void showError();

    void showLoadingDialog();

    void dismissLoadingDialog();

    void getRunTimePermissions();

    void checkUserSession();

    void openSignUp();

    void openLogin();

}
