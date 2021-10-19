package com.example.t_rpg;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_page);

        start_loading();
    }

    private void start_loading(){
        Handler handler = new Handler(); // 이건 그냥 스레드간 연결수단이라 생각하면 편한데 모이면 한번 설명 해줄게
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplication(), StartActivity.class));
            }
        }, 2000);
    }
}
