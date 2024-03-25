package kr.ac.tukorea.luh.uihwan.morecontrols;

import androidx.appcompat.app.AppCompatActivity;
import kr.ac.tukorea.luh.uihwan.morecontrols.databinding.ActivityMainBinding;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void onBtnDoIt(View view) {
        binding.pageTitleTextView.setText(R.string.you_get_one_grand);
    }
}