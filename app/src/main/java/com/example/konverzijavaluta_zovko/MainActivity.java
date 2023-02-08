package com.example.konverzijavaluta_zovko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

TextView textView;
EditText edt ;
float kune;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

textView=(TextView) findViewById(R.id.ispis);

        edt = (EditText) findViewById(R.id.inputKn);

    }
    public void Euri(View view)
    { kune=Float.parseFloat(edt.getText().toString());
        DecimalFormat df = new DecimalFormat("#.##");

        String euri = String.valueOf(df.format( kune/7.53));
        textView.setText(euri );
    }
    public void Funte(View view)
    { kune=Float.parseFloat(edt.getText().toString());
        DecimalFormat df = new DecimalFormat("#.##");

        String funte = String.valueOf(df.format( kune/8.46));
        textView.setText(funte );
    }
    public void Dolari(View view)
    { kune=Float.parseFloat(edt.getText().toString());
        DecimalFormat df = new DecimalFormat("#.##");

        String dolari = String.valueOf(df.format( kune/7.02));
        textView.setText(dolari );
    }


}
