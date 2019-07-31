package com.example.kaium.fadinganimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        ImageView blue = (ImageView) findViewById(R.id.blue);
        blue.setTranslationX(-1000f);
        */

        ImageView blue = (ImageView) findViewById(R.id.blue);

        blue.setTranslationX(-1000f);
        blue.setTranslationY(-1000f);
    }

    public void fade(View view){

        ImageView blue = (ImageView) findViewById(R.id.blue);

        //ImageView stream = (ImageView) findViewById(R.id.stream);

        blue.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotation(3600f)
                .setDuration(3000);

        //stream.animate().alpha(1f).setDuration(2000);
    }

}
