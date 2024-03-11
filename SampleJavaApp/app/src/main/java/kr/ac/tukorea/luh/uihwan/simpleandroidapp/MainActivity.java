package kr.ac.tukorea.luh.uihwan.simpleandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nameTextView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameTextView = findViewById(R.id.nameTextView);
    }

    public void onBtnPushMe(View view) {
        nameTextView.setText("Push Me");
    }

    public void onBtnAnother(View view) {
        nameTextView.setText("Another");
    }
}