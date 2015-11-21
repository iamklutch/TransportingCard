package com.yukidev.transportingcard;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.buttonA)Button mButtonA;
    @Bind(R.id.button2)Button mButton2;
    @Bind(R.id.button3)Button mButton3;
    @Bind(R.id.button4)Button mButton4;
    @Bind(R.id.button5)Button mButton5;
    @Bind(R.id.button6)Button mButton6;
    @Bind(R.id.button7)Button mButton7;
    @Bind(R.id.button8)Button mButton8;
    @Bind(R.id.button9)Button mButton9;
    @Bind(R.id.button10)Button mButton10;
    @Bind(R.id.buttonJ)Button mButtonJ;
    @Bind(R.id.buttonQ)Button mButtonQ;
    @Bind(R.id.buttonK)Button mButtonK;
    @Bind(R.id.buttonClubs)Button mButtonClubs;
    @Bind(R.id.buttonHearts)Button mButtonHearts;
    @Bind(R.id.buttonSpades)Button mButtonSpades;
    @Bind(R.id.buttonDiamonds)Button mButtonDiamonds;
    @Bind(R.id.learnTrickButton)Button mLearnTrickButton;
    @Bind(R.id.screenshotChooserButton)Button mChooseScreenshotButton;

    private String mCard = "a";
    private String mSuit = "s";
    private String mSelectedImagePath = "";

    protected Uri mMediaUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        ButterKnife.bind(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @OnClick (R.id.buttonA)
    protected void setButtonA(){
        mCard = "a";
        suitButtonsVisible();
        cardButtonsInvisible();
    }
    @OnClick (R.id.button2)
    protected void setButton2(){
        mCard = "2";
        suitButtonsVisible();
        cardButtonsInvisible();
    }
    @OnClick (R.id.button3)
    protected void setButton3(){
        mCard = "3";
        suitButtonsVisible();
        cardButtonsInvisible();
    }
    @OnClick (R.id.button4)
    protected void setButton4(){
        mCard = "4";
        suitButtonsVisible();
        cardButtonsInvisible();
    }
    @OnClick (R.id.button5)
    protected void setButton5(){
        mCard = "5";
        suitButtonsVisible();
        cardButtonsInvisible();
    }
    @OnClick (R.id.button6)
    protected void setButton6(){
        mCard = "6";
        suitButtonsVisible();
        cardButtonsInvisible();
    }
    @OnClick (R.id.button7)
    protected void setButton7(){
        mCard = "7";
        suitButtonsVisible();
        cardButtonsInvisible();
    }
    @OnClick (R.id.button8)
    protected void setButton8(){
        mCard = "8";
        suitButtonsVisible();
        cardButtonsInvisible();
    }
    @OnClick (R.id.button9)
    protected void setButton9(){
        mCard = "9";
        suitButtonsVisible();
        cardButtonsInvisible();
    }
    @OnClick (R.id.button10)
    protected void setButton10(){
        mCard = "t";
        suitButtonsVisible();
        cardButtonsInvisible();
    }
    @OnClick (R.id.buttonJ)
    protected void setButtonJ(){
        mCard = "j";
        suitButtonsVisible();
        cardButtonsInvisible();
    }
    @OnClick (R.id.buttonQ)
    protected void setButtonQ(){
        mCard = "q";
        suitButtonsVisible();
        cardButtonsInvisible();
    }
    @OnClick (R.id.buttonK)
    protected void setButtonK(){
        mCard = "k";
        suitButtonsVisible();
        cardButtonsInvisible();
    }
    @OnClick (R.id.buttonClubs)
    protected void setButtonClubs(){
        mSuit = "c";
        startTrick();
    }
    @OnClick (R.id.buttonHearts)
    protected void setButtonHearts(){
        mSuit = "h";
        startTrick();
    }
    @OnClick (R.id.buttonSpades)
    protected void setButtonSpades(){
        mSuit = "s";
        startTrick();
    }
    @OnClick (R.id.buttonDiamonds)
    protected void setButtonDiamonds(){
        mSuit = "d";
        startTrick();
    }

    private void suitButtonsVisible(){
        mButtonClubs.setVisibility(View.VISIBLE);
        mButtonSpades.setVisibility(View.VISIBLE);
        mButtonHearts.setVisibility(View.VISIBLE);
        mButtonDiamonds.setVisibility(View.VISIBLE);
    }

    private void cardButtonsInvisible(){
        mButtonA.setVisibility(View.INVISIBLE);
        mButton2.setVisibility(View.INVISIBLE);
        mButton3.setVisibility(View.INVISIBLE);
        mButton4.setVisibility(View.INVISIBLE);
        mButton5.setVisibility(View.INVISIBLE);
        mButton6.setVisibility(View.INVISIBLE);
        mButton7.setVisibility(View.INVISIBLE);
        mButton8.setVisibility(View.INVISIBLE);
        mButton9.setVisibility(View.INVISIBLE);
        mButton10.setVisibility(View.INVISIBLE);
        mButtonJ.setVisibility(View.INVISIBLE);
        mButtonQ.setVisibility(View.INVISIBLE);
        mButtonK.setVisibility(View.INVISIBLE);
    }

    @OnClick (R.id.learnTrickButton)
    protected void learnTrick(){
        //  open video to learn trick.
    }

    @OnClick (R.id.screenshotChooserButton)
    protected void chooseScreenshot(){
        //  choose screenshot for background.
        Intent choosePhotoIntent = new Intent(Intent.ACTION_GET_CONTENT);
        choosePhotoIntent.setType("image/*");
        startActivityForResult(Intent.createChooser(choosePhotoIntent,"Select Screenshot"), 0);

    }

    private void startTrick(){
        Intent intent = new Intent(this, TrickScreen.class);
        intent.putExtra("card", mCard);
        intent.putExtra("suit", mSuit);
        intent.setData(mMediaUri);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {

            if (requestCode == 0){
                mMediaUri = data.getData();
                mSelectedImagePath = mMediaUri.getPath();
//                mSelectedImagePath = getPath(mMediaUri);
                Intent mediaScanIntent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
                mediaScanIntent.setData(mMediaUri);
                sendBroadcast(mediaScanIntent);
            }
        }

    }

    public String getPath(Uri uri){
        if (uri == null){
            // TODO set some logging info
            return null;
        }
        // try to retrieve image from media store first -- only from gallery
        String[] projection = {MediaStore.Images.Media.DATA};
        Cursor cursor = managedQuery(uri, projection, null, null, null);

        if (cursor != null) {
            int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
            cursor.moveToFirst();
            return cursor.getString(column_index);
        }
        return uri.getPath();

    }
}
