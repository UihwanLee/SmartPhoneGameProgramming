package kr.ac.tukorea.luh.uihwan.simpleandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.pushMeButton);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.d("Tag", "msg");
        TextView tv = findViewById(R.id.nameTextView);
        tv.setText("Button pushed");
    }
}