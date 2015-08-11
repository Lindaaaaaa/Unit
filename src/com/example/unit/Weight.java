package com.example.unit;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by mac on 03/08/2015.
 */
public class Weight extends Activity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weightunit);

        final EditText editKilogram = (EditText) findViewById(R.id.w4);
        final EditText editGram = (EditText) findViewById(R.id.w5);
        Button buttonConvert = (Button) findViewById(R.id.w3);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View view) {
                                                 double kg1 = Double.valueOf(editKilogram.getText().toString());
                                                 double g1 = kg1 * 1000;
                                                 editGram.setText(String.valueOf(g1));
                                             }
                                         }

        );
    }
}

