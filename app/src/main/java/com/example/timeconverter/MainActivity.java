package com.example.timeconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tv2;
    EditText ed;
    ToggleButton tb;
    Button b;

    int h,m;
    double hours, minutes, seconds, value, temp;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv2 = findViewById(R.id.tv2);
        ed = findViewById(R.id.ed);
        tb = findViewById(R.id.tb);
        b = findViewById(R.id.b);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(ed.getText().toString().isEmpty())
                {
                    value = Double.parseDouble(ed.getText().toString());

                    if(tb.isChecked())
                    {
                        result = Double.toString(value*60);
                        tv2.setText(result+"Minutes");
                    }
                    else
                    {
                        result = Double.toString(( value*60));
                        tv2.setText(result+"Seconds");
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please Enter a Value", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}