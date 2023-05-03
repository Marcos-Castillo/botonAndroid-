package com.example.boton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int contador = 0;

    private TextView TVvariable;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TVvariable = (TextView) findViewById(R.id.nada);
    }
    public void metodoUsuario(View view) {
        Toast toast;
        contador++;
        TVvariable.setText(""+contador);
        String mensaje="tocaste "+contador;
        toast = Toast.makeText(this, mensaje,
                Toast.LENGTH_SHORT);
        toast.show();
    }
}