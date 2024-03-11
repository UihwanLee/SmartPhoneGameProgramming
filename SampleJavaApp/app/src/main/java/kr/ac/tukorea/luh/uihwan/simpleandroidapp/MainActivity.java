package kr.ac.tukorea.luh.uihwan.simpleandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnPushMe(View view) {
        TextView tv = findViewById(R.id.nameTextView);
        tv.setText("Push Me");
    }

    public void onBtnAnother(View view) {
        TextView tv = findViewById(R.id.nameTextView);
        tv.setText("Another");
    }
}