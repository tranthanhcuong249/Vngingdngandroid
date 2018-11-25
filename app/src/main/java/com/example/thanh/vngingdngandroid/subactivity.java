package com.example.thanh.vngingdngandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subactivity extends Activity {
    Button btnok;
    protected void onCreat(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.subactivity);
        btnok = (Button) findViewById(R.id.btnok);
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
