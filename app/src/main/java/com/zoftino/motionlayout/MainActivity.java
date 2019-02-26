package com.zoftino.motionlayout;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void registrationMotionLayout(View v){
        Intent i = new Intent( this, RegistrationActivity.class);
        startActivity(i);
    }
    public void widthExamples(View v){
        startMotionLayouExampleActivity("width");
    }
    public void twoPropertiesExamples(View v){
        startMotionLayouExampleActivity("twop");
    }
    public void multipleElementsExamples(View v){
        startMotionLayouExampleActivity("multipleE");
    }

    public void customAttributesExamples(View v){
        startMotionLayouExampleActivity("customA");
    }
    public void keyFrameSetExamples(View v){
        startMotionLayouExampleActivity("keyframeset");
    }
    private void startMotionLayouExampleActivity(String example){
        Intent i = new Intent( this, MotionLayoutExamplesActivity.class);
        i.putExtra("example", example);
        startActivity(i);

    }
}
