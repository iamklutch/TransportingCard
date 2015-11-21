package com.yukidev.transportingcard;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.io.File;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TrickScreen extends AppCompatActivity {

    @Bind(R.id.cardImageView) ImageView mCardImage;
    @Bind(R.id.screenshotImage) ImageView mScreenshotImage;
    String card = "";
    String suit = "";
    String cardName = "";
    private Uri mMediaUri;
    View mTrickScreenView;
    RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trick_screen);
        ButterKnife.bind(this);
        mTrickScreenView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        int uiOptions2 = View.SYSTEM_UI_FLAG_IMMERSIVE;
        int uiOptions3 = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;


        mTrickScreenView.setSystemUiVisibility(uiOptions | uiOptions2 | uiOptions3);

//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Intent intent = getIntent();
        card = intent.getStringExtra("card");
        suit = intent.getStringExtra("suit");
        mMediaUri = intent.getData();
        cardName = card+suit;

//        mScreenshotImage.setImageURI(mMediaUri);
        File file = new File(mMediaUri.getPath());
        Drawable drawable = Drawable.createFromPath(file.getAbsolutePath());
        rl = (RelativeLayout)findViewById(R.id.trickRelativeLayout);
        rl.setBackground(drawable);

        switch (cardName) {
            case "ac":
                mCardImage.setImageResource(R.drawable.card_ac);
                break;
            case "2c":
                mCardImage.setImageResource(R.drawable.card_2c);
                break;
            case "3c":
                mCardImage.setImageResource(R.drawable.card_3c);
                break;
            case "4c":
                mCardImage.setImageResource(R.drawable.card_4c);
                break;
            case "5c":
                mCardImage.setImageResource(R.drawable.card_5c);
                break;
            case "6c":
                mCardImage.setImageResource(R.drawable.card_6c);
                break;
            case "7c":
                mCardImage.setImageResource(R.drawable.card_7c);
                break;
            case "8c":
                mCardImage.setImageResource(R.drawable.card_8c);
                break;
            case "9c":
                mCardImage.setImageResource(R.drawable.card_9c);
                break;
            case "tc":
                mCardImage.setImageResource(R.drawable.card_tc);
                break;
            case "jc":
                mCardImage.setImageResource(R.drawable.card_jc);
                break;
            case "qc":
                mCardImage.setImageResource(R.drawable.card_qc);
                break;
            case "kc":
                mCardImage.setImageResource(R.drawable.card_kc);
                break;
            case "ah":
                mCardImage.setImageResource(R.drawable.card_ah);
                break;
            case "2h":
                mCardImage.setImageResource(R.drawable.card_2h);
                break;
            case "3h":
                mCardImage.setImageResource(R.drawable.card_3h);
                break;
            case "4h":
                mCardImage.setImageResource(R.drawable.card_4h);
                break;
            case "5h":
                mCardImage.setImageResource(R.drawable.card_5h);
                break;
            case "6h":
                mCardImage.setImageResource(R.drawable.card_6h);
                break;
            case "7h":
                mCardImage.setImageResource(R.drawable.card_7h);
                break;
            case "8h":
                mCardImage.setImageResource(R.drawable.card_8h);
                break;
            case "9h":
                mCardImage.setImageResource(R.drawable.card_9h);
                break;
            case "th":
                mCardImage.setImageResource(R.drawable.card_th);
                break;
            case "jh":
                mCardImage.setImageResource(R.drawable.card_jh);
                break;
            case "qh":
                mCardImage.setImageResource(R.drawable.card_qh);
                break;
            case "kh":
                mCardImage.setImageResource(R.drawable.card_kh);
                break;
            case "as":
                mCardImage.setImageResource(R.drawable.card_as);
                break;
            case "2s":
                mCardImage.setImageResource(R.drawable.card_2s);
                break;
            case "3s":
                mCardImage.setImageResource(R.drawable.card_3s);
                break;
            case "4s":
                mCardImage.setImageResource(R.drawable.card_4s);
                break;
            case "5s":
                mCardImage.setImageResource(R.drawable.card_5s);
                break;
            case "6s":
                mCardImage.setImageResource(R.drawable.card_6s);
                break;
            case "7s":
                mCardImage.setImageResource(R.drawable.card_7s);
                break;
            case "8s":
                mCardImage.setImageResource(R.drawable.card_8s);
                break;
            case "9s":
                mCardImage.setImageResource(R.drawable.card_9s);
                break;
            case "ts":
                mCardImage.setImageResource(R.drawable.card_ts);
                break;
            case "js":
                mCardImage.setImageResource(R.drawable.card_js);
                break;
            case "qs":
                mCardImage.setImageResource(R.drawable.card_qs);
                break;
            case "ks":
                mCardImage.setImageResource(R.drawable.card_ks);
                break;
            case "ad":
                mCardImage.setImageResource(R.drawable.card_ad);
                break;
            case "2d":
                mCardImage.setImageResource(R.drawable.card_2d);
                break;
            case "3d":
                mCardImage.setImageResource(R.drawable.card_3d);
                break;
            case "4d":
                mCardImage.setImageResource(R.drawable.card_4d);
                break;
            case "5d":
                mCardImage.setImageResource(R.drawable.card_5d);
                break;
            case "6d":
                mCardImage.setImageResource(R.drawable.card_6d);
                break;
            case "7d":
                mCardImage.setImageResource(R.drawable.card_7d);
                break;
            case "8d":
                mCardImage.setImageResource(R.drawable.card_8d);
                break;
            case "9d":
                mCardImage.setImageResource(R.drawable.card_9d);
                break;
            case "td":
                mCardImage.setImageResource(R.drawable.card_td);
                break;
            case "jd":
                mCardImage.setImageResource(R.drawable.card_jd);
                break;
            case "qd":
                mCardImage.setImageResource(R.drawable.card_qd);
                break;
            case "kd":
                mCardImage.setImageResource(R.drawable.card_kd);
                break;
            default:
                mCardImage.setImageResource(R.drawable.card_as);
                break;
        }

//        mCardImage.isShown();
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

}
