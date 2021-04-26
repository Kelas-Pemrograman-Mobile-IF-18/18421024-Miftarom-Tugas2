package com.miftarom.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtNpm, edtNama, edtProdi, edtFakultas, edtGender, edtTelp, edtAlamat;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(R.id.txtTampilkan);
        edtNpm  = (EditText) findViewById(R.id.edtNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtProdi = (EditText) findViewById(R.id.edtProdi);
        edtFakultas = (EditText) findViewById(R.id.edtFakultas);
        edtGender = (EditText) findViewById(R.id.edtGender);
        edtTelp = (EditText) findViewById(R.id.edtTelp);
        edtAlamat = (EditText) findViewById(R.id.edtAlamat);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String strNpm = edtNpm.getText().toString();
               String strNama = edtNama.getText().toString();
               String strProdi = edtProdi.getText().toString();
               String strFakultas = edtFakultas.getText().toString();
               String strGender = edtGender.getText().toString();
               String strTelp = edtTelp.getText().toString();
               String strAlamat = edtAlamat.getText().toString();

               txtTampil.setText(strNpm + "\n" + strNama + "\n" + strProdi + "\n" + strFakultas
                       + "\n" + strGender + "\n" + strTelp + "\n" + strAlamat);
            }
        });
    }
}