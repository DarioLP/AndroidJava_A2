package com.dariolopez.dariolopez_a2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
    }//end onCreate

    public void calcular(View view){

        double galones = Double.parseDouble(et1.getText().toString());

        double litros = galones * 3.785;
        double precioLitros =(3.50 * litros);

        String txtLitro = String.valueOf(litros);
        String txtPrecioLitros= String.valueOf(precioLitros);

        textView1.setText("litros: "+txtLitro);
        textView2.setText("Valor: "+txtPrecioLitros);

    }//end calcular

    public void salir(View view){
        Toast.makeText(this, "Saliendo...", Toast.LENGTH_SHORT).show();

        finish();
    }//end salir

}