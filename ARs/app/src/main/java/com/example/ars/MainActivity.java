package com.example.ars;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.GLES20;
import android.os.Bundle;

import com.example.ars.Model.OneGlSurfaceView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OneGlSurfaceView glSurfaceView = new OneGlSurfaceView(this);
        setContentView(glSurfaceView);
    }


}
