package kr.ac.tukorea.luh.uihwan.morecontrols;

import androidx.appcompat.app.AppCompatActivity;
import kr.ac.tukorea.luh.uihwan.morecontrols.databinding.ActivityMainBinding;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private int money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.nameEditText.addTextChangedListener(nameEditTextWatcher);

        binding.moneySeekBar.setOnSeekBarChangeListener(moneySeekbarChangeListener);
        setMoney(1000);
    }

    private final TextWatcher nameEditTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            if (binding.immediateSwitch.isChecked()) {
                doIt();
                return;
            }
            String name = binding.nameEditText.getText().toString().trim();
            String text = getString(R.string.name_length_msg, name.length());
            binding.pageTitleTextView.setText(text);
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

    private SeekBar.OnSeekBarChangeListener moneySeekbarChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            setMoney(seekBar.getProgress());
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    public void onBtnDoIt(View view) {
        doIt();
    }

    private void setMoney(int money) {
        this.money = money;
        binding.moneyValueTextView.setText(String.valueOf(money));
    }

    private void doIt() {
        boolean isGood = binding.goodProgrammerCheckbox.isChecked();
        int strId = isGood ? R.string.you_get_one_grand : R.string.you_have_nothing;
        String msg;
        if (isGood) {
            msg = getString(R.string.you_get_money, money);
        } else {
            msg = getString(R.string.you_have_nothing);
        }
        String name = binding.nameEditText.getText().toString().trim();
        if (name.isEmpty()) {
            name = getString(R.string.noname);
        }
        String text = getString(R.string.main_msg_fmt, name, msg);
        binding.pageTitleTextView.setText(text);
    }

    public void onCheckGoodProgrammer(View view) {
        boolean isGood = binding.goodProgrammerCheckbox.isChecked();
        int strId = isGood ? R.string.good_news : R.string.bad_news;
        binding.pageTitleTextView.setText(strId);
    }
}