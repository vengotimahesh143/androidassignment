package com.example.uicomponentsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
SeekBar mSeekbar;
RatingBar mRatingBar;
TextView rr,sr,tv;
ImageView myImage;
ImageButton myImageButton;
ToggleButton tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRatingBar=findViewById(R.id.rb);
        mSeekbar = findViewById(R.id.sb);
        rr=findViewById(R.id.result_rb);
        sr=findViewById(R.id.sb_result);
        tb=findViewById(R.id.togglebutton);
        tv=findViewById(R.id.tog);
        myImage=findViewById(R.id.iv);
        myImageButton=findViewById(R.id.ib);


        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (tb.isChecked()){
                    tv.setText("Toggle is on");
                }
                else {
                    tv.setText("Toggle is off");
                }
            }
        });



        mRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                rr.setText("Rating is: "+rating);
            }
        });
        mSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                sr.setText("progress is: "+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myImage.setImageResource(R.drawable.image_resources);
            }
        });
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myImageButton.setImageResource(R.drawable.image_resources);
            }
        });

    }

}