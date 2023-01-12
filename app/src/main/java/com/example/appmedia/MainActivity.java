package com.example.appmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNota1;
    EditText etNota2;
    EditText etNota3;
    TextView tvMedia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNota1 = findViewById( R.id.editTextNota1 );
        etNota2 = findViewById( R.id.editTextNota2 );
        etNota3 = findViewById( R.id.editTextNota3 );
        tvMedia = findViewById( R.id.textViewMedia );

    }

    public void calcularMedia(View view) {

        double n1, n2, n3, media;
        n1 = Double.parseDouble( etNota1.getText().toString() ) ;
        n2 = Double.parseDouble( etNota2.getText().toString() ) ;
        n3 = Double.parseDouble( etNota3.getText().toString() ) ;

        media = ( n1 + n2 + n3 ) / 3;

        tvMedia.setText( "Média: " + media );

    }

}







