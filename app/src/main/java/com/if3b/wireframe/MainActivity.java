package com.if3b.wireframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText tx_Box;
    Button bt_Button;
    TextView tv_View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx_Box=findViewById(R.id.tx_box);
        bt_Button=findViewById(R.id.bt_button);
        tv_View=findViewById(R.id.tv_view);

        bt_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Srtring nama=tx_Box.getText().toString();
                tv_View.setText("Hi"+nama);
            }
        });



    }
}