package com.example.unit;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Length extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    final EditText editCentimeters =(EditText)findViewById(R.id.editTextCentimeter);
   final EditText editInches =(EditText)findViewById(R.id.editInche);
    Button buttonConvert=(Button) findViewById(R.id.buttonConvert);

    buttonConvert.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            double centimeters=Double.valueOf(editCentimeters.getText().toString());
           double inches= centimeters*0.393700787;
            editInches.setText(String.valueOf(inches));

        }
    });
}
}
