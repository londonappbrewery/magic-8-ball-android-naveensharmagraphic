package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn = findViewById(R.id.button);

        final ImageView roll = findViewById(R.id.imageView);

        final int[] rolll = {R.drawable.ball1,
        R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random ran = new Random();
                int num = ran.nextInt(5);

                roll.setImageResource(rolll[num]);



            }
        });


    }
}
