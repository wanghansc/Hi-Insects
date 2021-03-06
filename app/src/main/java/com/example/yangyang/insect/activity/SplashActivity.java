package com.example.yangyang.insect.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yangyang.insect.R;

public class SplashActivity extends BaseActivity {

    ImageView iv_insect;
    TextView tv_chongqu;

    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        },4300);

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    private void initView() {
        iv_insect = findViewById(R.id.iv_insect);
        tv_chongqu = findViewById(R.id.tv_chongqu);

        Animation animation_translation = AnimationUtils.loadAnimation(SplashActivity.this,R.anim.translate);
        animation_translation.setFillAfter(true);
        animation_translation.setDuration(3000);
        iv_insect.startAnimation(animation_translation);

        Animation animation_scale = AnimationUtils.loadAnimation(SplashActivity.this,R.anim.scale);
        animation_scale.setFillAfter(true);
        animation_scale.setDuration(3000);
        tv_chongqu.startAnimation(animation_scale);
    }

}
