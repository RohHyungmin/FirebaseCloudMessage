package com.hyugnmin.android.firebasecloudmessage;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;



/*
 */
public class MyFirebaseInsIDService extends FirebaseInstanceIdService{
    @Override
    public void onTokenRefresh() {
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("", "Refreshed token: " + refreshedToken);
        // 서버를 구현한후 refreshedToken 을 서버측에 전달해줘야 한다
    }
}
