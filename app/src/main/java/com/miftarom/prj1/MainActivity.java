package com.miftarom.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView txtNama;
    TextView txtNpm;
    TextView txtProdi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNama = (TextView) findViewById(R.id.txtNama);
        txtNama.setText("Miftarom Rahmawan");
        txtNpm = (TextView) findViewById(R.id.txtNpm);
        txtNpm.setText("18421024");
        txtProdi = (TextView) findViewById(R.id.txtProdi);
        txtProdi.setText("Informatika");
    }
}