package org.neosoft.com.d5challenge;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup rBGrp;
    private RadioButton rBtn;
    private TextView txtDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDisplay = (TextView) findViewById(R.id.txtDisplay);
        rBGrp = (RadioGroup) findViewById(R.id.radioGroup);

        rBGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch(checkedId){
                    case R.id.rB1:
                        txtDisplay.setText("You selected first radio button");
                        break;
                    case R.id.rB2:
                        txtDisplay.setText("You selected second radio button");
                        break;
                    case R.id.rB3:
                        txtDisplay.setText("You selected third radio button");
                        break;
                    case R.id.rB4:
                        txtDisplay.setText("You selected fourth radio button");
                        break;
                }
            }
        });
    }
}
