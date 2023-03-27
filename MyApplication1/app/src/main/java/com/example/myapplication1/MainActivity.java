package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    mountains_by_region_Fragment mainFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 이미 xml에 id를 주고 선언한 경우
        /*mainFragment = (MainFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mainFragment);*/
        mainFragment = new mountains_by_region_Fragment();


        // 초기 메인화면에 프래그먼트 초기화 시키기 : 동적으로
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.contain, mainFragment).commit();


    }

}