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
        boolean isGood = binding.goodProgrammerCheckbox.isChecked();
        int strId = isGood ? R.string.you_get_one_grand : R.string.you_have_nothing;
        binding.pageTitleTextView.setText(strId);
    }

    public void onCheckGoodProgrammer(View view) {
        boolean isGood = binding.goodProgrammerCheckbox.isChecked();
        int strId = isGood ? R.string.good_news : R.string.bad_news;
        binding.pageTitleTextView.setText(strId);
    }
}