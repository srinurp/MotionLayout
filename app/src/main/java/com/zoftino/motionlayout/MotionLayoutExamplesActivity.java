package com.zoftino.motionlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MotionLayoutExamplesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String example = getIntent().getExtras().get("example").toString();
        setExampleLayout(example);
    }

    private void setExampleLayout(String example){
        switch (example){
            case "width" : setContentView(R.layout.motion_width);
                break;

            case "twop" : setContentView(R.layout.motion_two_properties);
                break;

            case "multipleE" : setContentView(R.layout.progress);
                break;

            case "customA" : setContentView(R.layout.custom_attributes_layout);
                break;

            case "keyframeset" : setContentView(R.layout.keyframeset_layout);
                break;


            case "default" : setContentView(R.layout.registration);

        }
    }
}

