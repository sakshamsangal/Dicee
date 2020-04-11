package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        final ImageView leftDice;
        final ImageView rightDice;


        rollButton = findViewById(R.id.rollButton);
        leftDice = findViewById(R.id.image_leftDice);
        rightDice = findViewById(R.id.image_rightDice);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                leftDice.setImageResource(diceArray[random.nextInt(6)]);
                rightDice.setImageResource(diceArray[random.nextInt(6)]);
//                Log.d("Dicee", "Button is pressed" + number);

            }
        });

    }
}
