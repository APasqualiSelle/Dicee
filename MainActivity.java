package com.alineselle.dicee;

import android.support.v7.app.AppCompatActivity;
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
        rollButton = findViewById(R.id.rollButton);


        final ImageView leftDice = findViewById(R.id.image_leftDice);
        final ImageView rightDice = findViewById(R.id.image_rightDice);

        //we will create an array[]of type int that contains 6 of our dice images
        //we create a constant using the word 'final' so we cannot change the number of elements inside the array
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

                Log.d("Dicee","Ze Button has been pressed!");
                //we create an new object of type Random
                Random randomNumberGenerator = new Random();
                //and now we will stock this object into a variable du type int that we will name 'number'
                int numberLeft = randomNumberGenerator.nextInt(6);
                int numberRight = randomNumberGenerator.nextInt(6);

                Log.d("Dicee","The random number is: "+numberLeft);

                leftDice.setImageResource(diceArray[numberLeft]);
                rightDice.setImageResource(diceArray[numberRight]);

            }
        });
    }
}
